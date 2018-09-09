package com.siswbrasil.workshopmongo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.siswbrasil.workshopmongo.domain.Post;
import com.siswbrasil.workshopmongo.repository.PostRepository;
import com.siswbrasil.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	private final PostRepository repo;

	public PostService(PostRepository repo) {
		this.repo = repo;
	}

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}