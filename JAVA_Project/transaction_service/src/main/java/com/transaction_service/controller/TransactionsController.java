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

import com.transaction_service.entity.Transactions;
import com.transaction_service.service.TransactionsService;

@RestController
@RequestMapping("/transaction")
public class TransactionsController {
	@Autowired
	private TransactionsService transactionsService;

	@GetMapping("/getalltransaction")
	public ResponseEntity<List<Transactions>> getAllTransaction() {
		return ResponseEntity.ok(transactionsService.getall());
	}

	@PostMapping("/savetransaction")
	public ResponseEntity<String> saveTransaction(@RequestBody Transactions transactions) {
		return ResponseEntity.ok(transactionsService.saveTransaction(transactions));
	}

	@PutMapping("/updatetransaction")
	public ResponseEntity<Transactions> updateTransactions(@PathVariable(value = "transactionId") Integer transactionId,
			@RequestBody Transactions transactions) {
		return ResponseEntity.ok(transactionsService.updateTransaction(transactionId, transactions));
	}

	@DeleteMapping("/deletetransaction")
	public ResponseEntity<String> deleteTransactions(Integer id) {
		return ResponseEntity.ok(transactionsService.deleteTransaction(id));
	}

}
