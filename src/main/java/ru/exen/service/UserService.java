package ru.exen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.exen.model.User;
import ru.exen.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User findById(Long id) {
		return userRepository.getOne(id);
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
}
