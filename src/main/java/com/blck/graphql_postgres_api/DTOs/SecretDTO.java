package com.blck.graphql_postgres_api.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SecretDTO {

	@Id
	private Long id;
	private Long nemesisId;
	private Long secretCode;

	public SecretDTO() {
	}

	public SecretDTO(Long id, Long nemesisId, Long secretCode) {
		this.id = id;
		this.nemesisId = nemesisId;
		this.secretCode = secretCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNemesisId() {
		return nemesisId;
	}

	public void setNemesisId(Long nemesisId) {
		this.nemesisId = nemesisId;
	}

	public Long getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Long secretCode) {
		this.secretCode = secretCode;
	}
}