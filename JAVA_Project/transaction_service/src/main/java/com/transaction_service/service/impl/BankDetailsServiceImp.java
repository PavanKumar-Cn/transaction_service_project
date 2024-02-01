package com.transaction_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction_service.entity.BankDetails;
import com.transaction_service.repository.BankDetailsRepository;
import com.transaction_service.service.BankDetailsService;

@Service
public class BankDetailsServiceImp implements BankDetailsService {

	@Autowired
	public BankDetailsRepository bankDetailsRepository;

	@Override
	public String saveBank(BankDetails bankDetails) {
		bankDetailsRepository.save(bankDetails);
		return "Saved Successfully";
	}

	@Override
	public String deleteBank(Integer id) {
		BankDetails bankDetails = bankDetailsRepository.findById(id).get();
		if (bankDetails.getStatus().equalsIgnoreCase("active")) {
			bankDetails.setStatus("Inactive");
		} else {
			bankDetails.setStatus("active");
		}
		return "Status changed";
	}

	@Override
	public BankDetails updateBank(Integer id, BankDetails bankDetails) {
		bankDetails.setBankId(id);
		bankDetails = bankDetailsRepository.save(bankDetails);
		return bankDetails;
	}

	@Override
	public List<BankDetails> getall() {
		return bankDetailsRepository.findAll();
	}

	@Override
	public BankDetails getById(Integer id) {
		return bankDetailsRepository.findById(id).get();
	}

}
