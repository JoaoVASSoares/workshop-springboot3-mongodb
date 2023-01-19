package com.joaovitor.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.workshopmongo.domain.User;
import com.joaovitor.workshopmongo.repository.UserRepository;
import com.joaovitor.workshopmongo.services.exception.ObjNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjNotFoundException("Objeto não encontrado"));
	}
}
