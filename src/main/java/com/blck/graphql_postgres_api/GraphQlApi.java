package com.blck.graphql_postgres_api;

import com.blck.graphql_postgres_api.DTOs.CharacterDTO;
import com.blck.graphql_postgres_api.Repositories.CharacterRepository;
import com.blck.graphql_postgres_api.Repositories.NemesisRepository;
import com.blck.graphql_postgres_api.Repositories.SecretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQlApi {

	private final CharacterRepository characterRepository;
	private final NemesisRepository nemesisRepository;
	private final SecretRepository secretRepository;

	@Autowired
	public GraphQlApi(CharacterRepository characterRepository,
					  NemesisRepository nemesisRepository,
					  SecretRepository secretRepository) {
		this.characterRepository = characterRepository;
		this.nemesisRepository = nemesisRepository;
		this.secretRepository = secretRepository;
	}

	@QueryMapping
	public long countCharacters() {
		return characterRepository.count();
	}

	@QueryMapping
	public Iterable<CharacterDTO> characters() {
		return characterRepository.findAll();
	}

	@QueryMapping
	public CharacterDTO character(@Argument Long id) {
		return characterRepository.findById(id).orElse(null);
	}

	@QueryMapping
	public Double averageAges() {
		Double averageChars = characterRepository.averageAge();
		Double averageNemeses = nemesisRepository.averageAge();
		return (averageChars + averageNemeses) / 2;
	}

	@QueryMapping
	public Double averageCharWeight() {
		return characterRepository.averageCharWeight();
	}

	@QueryMapping
	public List<Object[]> charactersAndTheirJoins() {
		// this returns object hashes - I didn't want to spend a lot of time on serialisation
		List<Object[]> results = characterRepository.charactersAndTheirJoins();
		return results;
	}
}