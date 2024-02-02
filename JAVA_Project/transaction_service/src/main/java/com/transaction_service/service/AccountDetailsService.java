package com.transaction_service.service;

import java.util.List;

import com.transaction_service.entity.AccountDetails;
import com.transaction_service.exception.AccountNotFound;

public interface AccountDetailsService {

	public String saveAccount(AccountDetails accountDetails);

	public String deleteAccount(Integer id);

	public AccountDetails updateAccount(Integer id, AccountDetails accountDetails);

	public List<AccountDetails> getall();

	public AccountDetails getById(Integer id) throws AccountNotFound;
}