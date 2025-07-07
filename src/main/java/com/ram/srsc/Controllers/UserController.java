package com.ram.srsc.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.srsc.Entities.Users;
import com.ram.srsc.Repositories.UserRepository;
import com.ram.srsc.Services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<Users> getAll(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Users> getById(@PathVariable Long id) {
	    Optional<Users> user = userRepository.findById(id);
	    if (user.isPresent()) {
	        return ResponseEntity.ok(user.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	@PostMapping
	public Users create(@RequestBody Users user) {
		return userService.createUsers(user);
	}
	
	@PutMapping("/{id}")
	public Users update(@PathVariable Long id, @RequestBody Users user) {
		return userService.updateUsers(id, user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.deleteUsers(id);
	}

}
