package com.transaction_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction_service.entity.Transactions;
import com.transaction_service.repository.TransactionsRepository;
import com.transaction_service.service.TransactionsService;

@Service
public class TransactionsServiceImp implements TransactionsService {

	@Autowired
	TransactionsRepository repository;

	@Override
	public String saveTransaction(Transactions transactions) {
		repository.save(transactions);
		return "Saved Successfully";
	}

	@Override
	public String deleteTransaction(Integer id) {
		repository.deleteById(id);
		return "deleted Successfully";
	}

	@Override
	public Transactions updateTransaction(Integer id, Transactions transactions) {
		transactions.setTransactionId(id);
		transactions = repository.save(transactions);
		return transactions;
	}

	@Override
	public List<Transactions> getall() {
		return repository.findAll();
	}

	@Override
	public Transactions getById(Integer id) {
		return repository.findById(id).get();
	}

}
