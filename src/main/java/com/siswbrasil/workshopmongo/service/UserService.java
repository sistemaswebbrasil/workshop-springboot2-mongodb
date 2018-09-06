package com.siswbrasil.workshopmongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.siswbrasil.workshopmongo.domain.User;
import com.siswbrasil.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository repo;
	
	public UserService(UserRepository repo){
		this.repo = repo;		
	}
	
	public List<User> findAll(){
		return repo.findAll();		
	}

}
