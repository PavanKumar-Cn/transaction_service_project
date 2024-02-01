package com.transaction_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction_service.entity.AccountDetails;
import com.transaction_service.repository.AccountDetailsRepository;
import com.transaction_service.service.AccountDetailsService;

@Service
public class AccountDetailsImp implements AccountDetailsService {

	@Autowired
	private AccountDetailsRepository repository;

	@Override
	public String saveAccount(AccountDetails accountDetails) {
		repository.save(accountDetails);
		return "saved Successfully";
	}

	@Override
	public String deleteAccount(Integer id) {
		AccountDetails accountDetails = repository.findById(id).get();
		if (accountDetails.getStatus().equalsIgnoreCase("active")) {
			accountDetails.setStatus("Inactive");
		} else {
			accountDetails.setStatus("active");
		}
		return "Status changed";
	}

	@Override
	public AccountDetails updateAccount(Integer id, AccountDetails accountDetails) {
		accountDetails.setAccountId(id);
		accountDetails = repository.save(accountDetails);
		return accountDetails;
	}

	@Override
	public List<AccountDetails> getall() {

		return repository.findAll();
	}

	@Override
	public AccountDetails getById(Integer id) {
		return repository.findById(id).get();
	}

}
