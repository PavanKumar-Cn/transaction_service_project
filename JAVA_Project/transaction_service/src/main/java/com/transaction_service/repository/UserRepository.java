package com.transaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction_service.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {
}
