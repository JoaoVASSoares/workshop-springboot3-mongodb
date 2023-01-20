package com.joaovitor.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.workshopmongo.domain.Post;
import com.joaovitor.workshopmongo.repository.PostRepository;
import com.joaovitor.workshopmongo.services.exception.ObjNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjNotFoundException("Objeto não encontrado"));
	}

}