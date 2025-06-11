package com.blck.graphql_postgres_api;

import com.blck.graphql_postgres_api.DTOs.CharacterDTO;
import com.blck.graphql_postgres_api.Repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQlApi {

	private final CharacterRepository characterRepository;

	@Autowired
	public GraphQlApi(CharacterRepository characterRepository) {
		this.characterRepository = characterRepository;
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
}