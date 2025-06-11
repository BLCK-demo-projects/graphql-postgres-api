package com.blck.graphql_postgres_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SchemaService {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public SchemaService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Map<String, List<String>> getSchema() {
		String sql = """
			SELECT table_name, column_name
			FROM information_schema.columns
			WHERE table_schema = 'public'
				AND table_name IN ('character', 'nemesis', 'secret')
			ORDER BY table_name;
		""";

		/*
		 * [
		 *   {
		 *     "table_name": "character",
		 *     "column_name": "id"
		 *   },
		 *   {
		 *     "table_name": "character",
		 *     "column_name": "name"
		 *   },
		 */
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		return reduceByTables(rows);
	}

	public HashMap<String, List<String>> reduceByTables(List<Map<String, Object>> rows) {
		return rows.stream()
			.collect(Collectors.groupingBy(
				row -> (String) row.get("table_name"),
				HashMap::new,
				Collectors.mapping(row -> (String) row.get("column_name"),
					Collectors.toList())
			));
	}
}