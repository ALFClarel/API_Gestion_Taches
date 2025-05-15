package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "boards")
public interface BoardRepository extends CrudRepository<Board, Long> {
}
