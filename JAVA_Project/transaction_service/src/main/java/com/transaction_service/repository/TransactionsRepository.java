package com.transaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction_service.entity.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {
}
