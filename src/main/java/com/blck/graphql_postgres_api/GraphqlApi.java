package com.blck.graphql_postgres_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GraphqlApi {

	private final CharacterRepository characterRepository;

	@Autowired
	public GraphqlApi(CharacterRepository characterRepository) {
		this.characterRepository = characterRepository;
	}

	@GetMapping("/details")
	public List<Character> getInfo() {
		return characterRepository.findAll();
	}

}
