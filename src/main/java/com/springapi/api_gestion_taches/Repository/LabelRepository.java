package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.Label;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "labels")
public interface LabelRepository extends CrudRepository<Label, Long> {
}
