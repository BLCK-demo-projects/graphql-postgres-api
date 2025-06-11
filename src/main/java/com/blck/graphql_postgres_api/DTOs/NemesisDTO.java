package com.blck.graphql_postgres_api.DTOs;

import jakarta.persistence.*;

@Entity
@Table(name = "nemesis")
public class NemesisDTO {

	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name = "character_id")
	private CharacterDTO characterId;

	private Boolean isAlive;
	private Integer years;

	public NemesisDTO() {
	}

	public NemesisDTO(Long id, CharacterDTO characterId, Boolean isAlive, Integer years) {
		this.id = id;
		this.characterId = characterId;
		this.isAlive = isAlive;
		this.years = years;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CharacterDTO getCharacterId() {
		return characterId;
	}

	public void setCharacterId(CharacterDTO characterId) {
		this.characterId = characterId;
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}
}