package com.blck.graphql_postgres_api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Character {
	@Id
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
