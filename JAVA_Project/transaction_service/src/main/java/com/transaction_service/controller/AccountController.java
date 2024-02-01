package com.transaction_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction_service.entity.AccountDetails;
import com.transaction_service.service.AccountDetailsService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountDetailsService accountDetailsService;

	@GetMapping("/getallaccount")
	public ResponseEntity<List<AccountDetails>> getAllAccounts() {
		return ResponseEntity.ok(accountDetailsService.getall());
	}

	@PostMapping("/saveaccount")
	public ResponseEntity<String> saveAccount(@RequestBody AccountDetails accountDetails) {
		return ResponseEntity.ok(accountDetailsService.saveAccount(accountDetails));
	}

	@PutMapping("/updateaccount")
	public ResponseEntity<AccountDetails> updateAccount(@PathVariable(value = "accountId") Integer accountId,
			@RequestBody AccountDetails accountDetails) {
		return ResponseEntity.ok(accountDetailsService.updateAccount(accountId, accountDetails));
	}

	@DeleteMapping("/deleteaccount")
	public ResponseEntity<String> deleteAccount(Integer id) {
		return ResponseEntity.ok(accountDetailsService.deleteAccount(id));
	}

}
