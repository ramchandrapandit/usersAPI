package com.ram.srsc.Services;

import java.util.List;
import java.util.Optional;

import com.ram.srsc.Entities.Users;

public interface UserService {
	List<Users> getAllUsers();
	Optional<Users> findById(Long id);
	//Users getUsersById(Long id);
	Users createUsers(Users user);
	Users updateUsers(Long id, Users user);
	void deleteUsers(Long id);

}
