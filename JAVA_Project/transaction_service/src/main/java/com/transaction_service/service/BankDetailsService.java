package com.transaction_service.service;

import java.util.List;

import com.transaction_service.entity.BankDetails;
import com.transaction_service.exception.BankNotFound;

public interface BankDetailsService {

	public String saveBank(BankDetails bankDetails);

	public String deleteBank(Integer id);

	public BankDetails updateBank(Integer id, BankDetails bankDetails);

	public List<BankDetails> getall();

	public BankDetails getById(Integer id) throws BankNotFound;
}
