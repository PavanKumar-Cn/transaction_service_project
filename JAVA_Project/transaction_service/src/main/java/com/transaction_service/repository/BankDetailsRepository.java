package com.transaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction_service.entity.BankDetails;

public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer> {
}
