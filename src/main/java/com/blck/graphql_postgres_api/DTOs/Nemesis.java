package com.blck.graphql_postgres_api.DTOs;

public record Nemesis (
	Long id,
	Long characterId,
	Boolean isAlive,
	Integer years
)
{ }
