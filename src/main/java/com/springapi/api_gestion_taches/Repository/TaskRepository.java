package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tasks")
public interface TaskRepository extends CrudRepository<Task, Long> {
}
