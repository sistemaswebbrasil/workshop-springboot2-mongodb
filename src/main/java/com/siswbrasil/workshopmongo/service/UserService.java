package com.siswbrasil.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.siswbrasil.workshopmongo.domain.User;
import com.siswbrasil.workshopmongo.repository.UserRepository;
import com.siswbrasil.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	private final UserRepository repo;
	
	public UserService(UserRepository repo){
		this.repo = repo;		
	}
	
	public List<User> findAll(){
		return repo.findAll();		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
