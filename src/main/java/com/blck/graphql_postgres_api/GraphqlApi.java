package com.blck.graphql_postgres_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class GraphqlApi {

	private final CharacterRepository characterRepository;
	private final SchemaService schemaService;

	@Autowired
	public GraphqlApi(CharacterRepository characterRepository, SchemaService schemaService) {
		this.characterRepository = characterRepository;
		this.schemaService = schemaService;
	}

	@GetMapping("/details")
	public List<Character> getInfo() {
		return characterRepository.findAll();
	}

	@GetMapping("/schema")
	public Map<String, List<String>> getSchema() {
		return schemaService.getSchema();
	}

}
