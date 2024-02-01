package com.transaction_service.entity;

import java.time.Instant;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.transaction_service.convertors.InstantTimeDeserializer;
import com.transaction_service.convertors.InstantTimeSerializer;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U> {

	@CreatedBy
	private U createdBy;

	@JsonDeserialize(using = InstantTimeDeserializer.class)
	@JsonSerialize(using = InstantTimeSerializer.class)
	@CreatedDate
	private Instant createdDate;

	@LastModifiedBy
	private U lastModifiedBy;

	@JsonDeserialize(using = InstantTimeDeserializer.class)
	@JsonSerialize(using = InstantTimeSerializer.class)
	@LastModifiedDate
	private Instant lastModifiedDate;
}
