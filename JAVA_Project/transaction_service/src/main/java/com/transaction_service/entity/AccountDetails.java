package com.transaction_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "AccountDetails")
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountId;

	@Column(name = "account_holder_name", length = 40, nullable = false)
	private String accountHolderName;

	@Column(name = "account_number", length = 20, nullable = false)
	private String accountNumber;

	@Column(name = "balance")
	private Long balance;

	@Column(name = "exclude", length = 10, nullable = false)
	private String exclude;

	@Column(name = "status", length = 10, nullable = false)
	private String status;

	@Column(name = "account_type", length = 10, nullable = false)
	private String accountType;

	@ManyToOne
	@JoinColumn(name = "bankId", nullable = false)
	private BankDetails bankDetails;

}
