package com.blck.graphql_postgres_api.DTOs;

public record Secret(
	Long id,
	Long nemesisId,
	Long secretCode
)
{ }
