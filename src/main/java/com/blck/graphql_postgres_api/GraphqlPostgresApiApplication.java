package com.blck.graphql_postgres_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class GraphqlPostgresApiApplication {

	private final SchemaService schemaService;

	@Autowired
	public GraphqlPostgresApiApplication(SchemaService schemaService) {
		this.schemaService = schemaService;
	}

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPostgresApiApplication.class, args);
	}

	@Component
	public class StartupRunner implements CommandLineRunner {
		@Override
		public void run(String... args) {
			System.out.println("running");
		}
	}


}
