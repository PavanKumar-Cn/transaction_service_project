package com.transaction_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "login")
public class User extends Auditable<Integer> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_name", unique = true, length = 50, nullable = false)
	private String userName;

	@Column(name = "password", length = 100, nullable = false)
	private String password;
	
//	@Enumerated(EnumType.STRING)
//	private Role role;
}
