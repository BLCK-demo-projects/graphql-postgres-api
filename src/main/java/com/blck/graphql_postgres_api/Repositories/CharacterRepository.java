package com.blck.graphql_postgres_api.Repositories;

import com.blck.graphql_postgres_api.DTOs.CharacterDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterDTO, Long> {
}
