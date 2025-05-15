package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.Task;
import com.springapi.api_gestion_taches.Entity.UrgentTask;
import com.springapi.api_gestion_taches.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "urgentTasks")
public interface UrgentTaskRepository extends CrudRepository<UrgentTask, Long> {
    List<UrgentTask> findByInProgress(Boolean inProgress);

    List<UrgentTask> findByCreatorAndInProgress(User id, Boolean inProgress);
}
