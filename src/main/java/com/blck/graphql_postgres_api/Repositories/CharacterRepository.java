package com.blck.graphql_postgres_api.Repositories;

import com.blck.graphql_postgres_api.DTOs.CharacterDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CharacterRepository extends JpaRepository<CharacterDTO, Long> {

	@Query("""
		SELECT AVG(EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM c.born))
		FROM CharacterDTO c
	""")
	Double averageAge();

	@Query("""
		SELECT AVG(d.weight)
		FROM CharacterDTO d
		WHERE d.weight IS NOT NULL
	""")
	Double averageCharWeight();

	@Query("""
		SELECT c, n, s
		FROM CharacterDTO c
		LEFT JOIN NemesisDTO n ON n.characterId = c
		LEFT JOIN SecretDTO s ON s.nemesis = n
	""")
	List<Object[]> charactersAndTheirJoins();
}
