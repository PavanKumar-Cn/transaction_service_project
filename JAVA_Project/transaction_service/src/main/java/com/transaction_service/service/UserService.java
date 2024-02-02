package com.transaction_service.service;

import com.transaction_service.entity.User;
import com.transaction_service.exception.UserNotFound;

public interface UserService {
	User saveUser(User user);

	User updateUser(User user, Integer admin) throws UserNotFound;

	User findUserById(Integer userId) throws UserNotFound;
}
