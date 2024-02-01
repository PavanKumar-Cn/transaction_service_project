package com.transaction_service.entity;

import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "Transactions")
public class Transactions extends Auditable<String> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;

	@ManyToOne
	@JoinColumn(name = "bank_id", nullable = false)
	private BankDetails bankDetails;

	@ManyToOne
	@JoinColumn(name = "account_id", nullable = false)
	private AccountDetails accountDetails;

	@Column(name = "amount", nullable = false)
	private BigDecimal amount;

	@Column(name = "transaction_date", nullable = false)
	private Date transactionDate;

}
