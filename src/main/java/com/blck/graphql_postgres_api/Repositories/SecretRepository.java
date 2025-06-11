package com.blck.graphql_postgres_api.Repositories;

import com.blck.graphql_postgres_api.DTOs.SecretDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretRepository extends JpaRepository<SecretDTO, Long> {
}
