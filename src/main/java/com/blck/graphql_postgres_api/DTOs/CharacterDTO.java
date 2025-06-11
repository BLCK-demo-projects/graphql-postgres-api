package com.blck.graphql_postgres_api.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "character")
public class CharacterDTO {

	@Id
	private Long id;
	private String name;
	private String gender;
	private String ability;
	private Float minimalDistance;
	private Float weight;
	private LocalDate born;
	private String inSpaceSince;
	private Integer beerConsumption;
	private Boolean knowsTheAnswer;

	public CharacterDTO() {
	}

	public CharacterDTO(Long id,
						String name,
						String gender,
						String ability,
						Float minimalDistance,
						Float weight,
						LocalDate born,
						String inSpaceSince,
						Integer beerConsumption,
						Boolean knowsTheAnswer) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.ability = ability;
		this.minimalDistance = minimalDistance;
		this.weight = weight;
		this.born = born;
		this.inSpaceSince = inSpaceSince;
		this.beerConsumption = beerConsumption;
		this.knowsTheAnswer = knowsTheAnswer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public Float getMinimalDistance() {
		return minimalDistance;
	}

	public void setMinimalDistance(Float minimalDistance) {
		this.minimalDistance = minimalDistance;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public LocalDate getBorn() {
		return born;
	}

	public void setBorn(LocalDate born) {
		this.born = born;
	}

	public String getInSpaceSince() {
		return inSpaceSince;
	}

	public void setInSpaceSince(String inSpaceSince) {
		this.inSpaceSince = inSpaceSince;
	}

	public Integer getBeerConsumption() {
		return beerConsumption;
	}

	public void setBeerConsumption(Integer beerConsumption) {
		this.beerConsumption = beerConsumption;
	}

	public Boolean getKnowsTheAnswer() {
		return knowsTheAnswer;
	}

	public void setKnowsTheAnswer(Boolean knowsTheAnswer) {
		this.knowsTheAnswer = knowsTheAnswer;
	}
}