package com.blck.graphql_postgres_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dev")
public class DevRestController {

	private final SchemaService schemaService;

	@Autowired
	public DevRestController(SchemaService schemaService) {
		this.schemaService = schemaService;
	}

	@GetMapping("/schema")
	public List<Map<String, Object>> getSchema() {
		return schemaService.getSchema();
	}

	@GetMapping("reducedSchema")
	public Map<String, List<String>> getReducedSchema() {
		return schemaService.getReducedSchema();
	}

}
