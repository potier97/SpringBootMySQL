package com.simpleapidb.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.simpleapidb.entity.User;


public interface UserService {

	public Iterable<User> findAll();
	 
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> findById(Long Id);
	
	public User save(User account);
	
	public void deleteById(Long id);
	
	
}

 



 