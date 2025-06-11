package com.blck.graphql_postgres_api;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SchemaServiceTest {

	SchemaService schemaService = new SchemaService(null);

	private Map<String, Object> insertRow(String tableName, String columnName) {
		Map<String, Object> row = new HashMap<>();
		row.put("table_name", tableName);
		row.put("column_name", columnName);
		return row;
	}

	@Test
	void reduceByTables() {
		List<Map<String, Object>> rows = new ArrayList<>();
		rows.add(insertRow("character", "id"));
		rows.add(insertRow("character", "name"));
		rows.add(insertRow("nemesis", "id"));
		rows.add(insertRow("nemesis", "years"));

		HashMap<String, List<String>> result = schemaService.reduceByTables(rows);

		assertAll(
			() -> assertEquals(2, result.size()),
			() -> 	assertEquals(Arrays.asList("id", "name"), result.get("character")),
			() -> assertEquals(Arrays.asList("id", "years"), result.get("nemesis"))
		);
	}


}
