package com.transaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction_service.entity.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {
}
