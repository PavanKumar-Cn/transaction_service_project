package com.transaction_service.service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.transaction_service.entity.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user, Integer admin) throws NotFoundException;

	User findUserById(Integer userId) throws NotFoundException;

}
