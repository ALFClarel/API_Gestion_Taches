package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.UrgentTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "urgentTasks")
public interface UrgentTaskRepository extends CrudRepository<UrgentTask, Long> {
}
