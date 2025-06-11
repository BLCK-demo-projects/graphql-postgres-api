package com.blck.graphql_postgres_api.Repositories;

import com.blck.graphql_postgres_api.DTOs.SecretDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NemesisRepository extends JpaRepository<SecretDTO, Long> {

	@Query("""
		SELECT AVG(n.years)
		FROM NemesisDTO n
	""")
	Double averageAge();

}
