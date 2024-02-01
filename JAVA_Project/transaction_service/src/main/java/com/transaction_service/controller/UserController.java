package com.transaction_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction_service.entity.User;
import com.transaction_service.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<User> user(@RequestBody User user){
		log.info("user controller "+user);
		return ResponseEntity.ok(userService.saveUser(user));
		
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> user(@PathVariable Integer userId) throws NotFoundException{
		log.info("user controller user by Id : "+userId);
		return ResponseEntity.ok(userService.findUserById(userId));
		
	}
	
	//don't use this method not fully implemented, need to functionality
	/*
	 * @PutMapping("/update/{admin}") public ResponseEntity<User>
	 * userUpdate(@RequestBody User user,@PathVariable Integer admin) throws
	 * NotFoundException{
	 * 
	 * log.info("user controller update : "+user); try { return
	 * ResponseEntity.ok(userService.updateUser(user, admin)); } catch
	 * (NotFoundException e) {
	 * 
	 * throw new NotFoundException(); }
	 * 
	 * }
	 */
}
