package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.Task;
import com.springapi.api_gestion_taches.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "tasks")
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByInProgress(Boolean inProgress);

    List<Task> findByCreatorAndInProgress(User id, Boolean inProgress);
}
