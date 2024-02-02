package com.transaction_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction_service.entity.BankDetails;
import com.transaction_service.service.BankDetailsService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController
@RequestMapping("/bank")
@Slf4j
public class BankController {

	@Autowired
	private BankDetailsService bankDetailsService;

	@GetMapping("/getallbanks")
	public ResponseEntity<List<BankDetails>> getAllBanks() {
		log.info("Bank Controller Get All");
		return ResponseEntity.ok(bankDetailsService.getall());
	}

	@PostMapping("/savebank")
	public ResponseEntity<String> saveBank(@RequestBody BankDetails bankDetails) {
		log.info("Bank Controller save"+bankDetails);
		return ResponseEntity.ok(bankDetailsService.saveBank(bankDetails));
	}

	@PutMapping("/updatebank")
	public ResponseEntity<BankDetails> updateBank(@PathVariable(value = "bankId") Integer bankId,
			@RequestBody BankDetails bankDetails) {
		log.info("Bank Controller update "+bankId+" "+bankDetails);
		return ResponseEntity.ok(bankDetailsService.updateBank(bankId, bankDetails));
	}

	@DeleteMapping("/deletebank")
	public ResponseEntity<String> deleteBank(Integer id) {
		log.info("Bank Controller delete"+id);
		return ResponseEntity.ok(bankDetailsService.deleteBank(id));
	}

}
