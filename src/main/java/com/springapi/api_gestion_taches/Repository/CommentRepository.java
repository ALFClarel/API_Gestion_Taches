package com.springapi.api_gestion_taches.Repository;

import com.springapi.api_gestion_taches.Entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments")
public interface CommentRepository extends CrudRepository<Comment, Long> {
}
