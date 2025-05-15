package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")
public interface UserRepository extends CrudRepository<User, Long> {
}
