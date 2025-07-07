package com.ram.srsc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.srsc.Entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
