package com.ram.srsc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.srsc.Entities.Users;
import com.ram.srsc.Repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	@Override
	public Optional<Users> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}


//	@Override
//	public Users getUsersById(Long id) {
//		// TODO Auto-generated method stub
//		return userRepository.findById(id).orElse(null);
//	}

	@Override
	public Users createUsers(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Users updateUsers(Long id, Users user) {
		// TODO Auto-generated method stub
		Users Existing=userRepository.findById(id).orElse(null);
		if(Existing!=null) {
			Existing.setName(user.getName());
			Existing.setAge(user.getAge());
			Existing.setEmail(user.getEmail());
			return userRepository.save(Existing);
		}
		return null;
	}

	@Override
	public void deleteUsers(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	
}
