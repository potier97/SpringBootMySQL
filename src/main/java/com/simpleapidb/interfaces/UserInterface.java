package com.simpleapidb.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpleapidb.entity.User;

@Repository
public interface UserInterface extends JpaRepository<User, Long>{

	
	
	
}
