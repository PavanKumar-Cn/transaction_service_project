package com.transaction_service.service.impl;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.transaction_service.entity.User;
import com.transaction_service.repository.UserRepository;
import com.transaction_service.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		user.setCreatedBy(0);
		user.setCreatedDate(Instant.now());
		return userRepository.save(user);
	}
	
	@Override
	public User findUserById(Integer userId) throws NotFoundException {
		User user = userRepository.findById(userId).orElseThrow(()-> new NotFoundException());
		return user;
	}
	
	@Override
	public User updateUser(User requestUser, Integer adminId) throws NotFoundException {
//		User user = User.builder()
//		.userName(null)
//		.password(null)
//		.build();
//		user.setCreatedBy(adminId);
		
		
//		Optional<User> dbUser = userRepository.findById(requestUser.getId());
//		if(dbUser.isPresent()) {
//		User user = User.builder().
//		
//			return userRepository.save(dbUser.get());
//		}else {
//			throw new NotFoundException();
//		}
		
		return new User();
	}

	
	
	

}
