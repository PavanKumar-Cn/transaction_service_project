package com.transaction_service.service;

import java.util.List;

import com.transaction_service.entity.Transactions;

public interface TransactionsService {
	public String saveTransaction(Transactions transactions);

	public String deleteTransaction(Integer id);

	public Transactions updateTransaction(Integer id, Transactions transactions);

	public List<Transactions> getall();

	public Transactions getById(Integer id);

}
