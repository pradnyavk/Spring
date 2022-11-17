package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entities.User;

@Repository
public interface CustomUserRepository extends JpaRepository<User,Long>{
	
	User findByName(String username);

}
