package com.blck.graphql_postgres_api.DTOs;

public record Character(
		Long id,
		String name,
		String gender,
		String ability,
		Float minimalDistance,
		Float weight,
		String born,
		String inSpaceSince,
		Integer beerConsumption,
		Boolean knowsTheAnswer
)
{ }
