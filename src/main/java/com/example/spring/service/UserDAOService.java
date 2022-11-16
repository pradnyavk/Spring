package com.example.spring.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.spring.entities.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long save(User user){
		entityManager.persist(user);
		return user.getId();
	}

}
