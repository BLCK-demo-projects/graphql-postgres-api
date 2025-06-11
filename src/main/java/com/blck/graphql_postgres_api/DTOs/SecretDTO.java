package com.blck.graphql_postgres_api.DTOs;

import jakarta.persistence.*;

@Entity
@Table(name = "secret")
public class SecretDTO {

	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name = "nemesis_id")
	private NemesisDTO nemesis;

	private Long secretCode;

	public SecretDTO() {
	}

	public SecretDTO(Long id, NemesisDTO nemesisId, Long secretCode) {
		this.id = id;
		this.nemesis = nemesisId;
		this.secretCode = secretCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NemesisDTO getNemesisId() {
		return nemesis;
	}

	public void setNemesisId(NemesisDTO nemesisId) {
		this.nemesis = nemesisId;
	}

	public Long getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Long secretCode) {
		this.secretCode = secretCode;
	}
}