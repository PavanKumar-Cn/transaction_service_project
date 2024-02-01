package com.transaction_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "bank_details")
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bankId;

	@Column(name = "bank_name", unique = true, length = 20, nullable = false)
	private String bankName;

	@Column(name = "status", length = 10, nullable = false)
	private String status;

}
