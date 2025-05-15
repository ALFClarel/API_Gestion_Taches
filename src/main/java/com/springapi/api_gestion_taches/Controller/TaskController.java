package com.springapi.api_gestion_taches.Controller;

import com.springapi.api_gestion_taches.Entity.Task;
import com.springapi.api_gestion_taches.Entity.UrgentTask;
import com.springapi.api_gestion_taches.Entity.User;
import com.springapi.api_gestion_taches.Repository.TaskRepository;
import com.springapi.api_gestion_taches.Repository.UrgentTaskRepository;
import com.springapi.api_gestion_taches.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    private final TaskRepository taskRepository;
    private final UrgentTaskRepository urgentTaskRepository;
    private final UserRepository userRepository;

    public TaskController(TaskRepository taskRepository,
                          UrgentTaskRepository urgentTaskRepository,
                          UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.urgentTaskRepository = urgentTaskRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/tasks/inProgress")
    public ResponseEntity<String> inProgress() {
        return ResponseEntity.ok().body(taskRepository.findByInProgress(true).toString() +
                urgentTaskRepository.findByInProgress(true).toString());
    }

    @GetMapping("/tasks/inProgress/{userId}")
    public ResponseEntity<List<Object>> inProgressByUser(@PathVariable Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Task> normalTasks = taskRepository.findByCreatorAndInProgress(user, true);
        List<UrgentTask> urgentTasks = urgentTaskRepository.findByCreatorAndInProgress(user, true);

        return ResponseEntity.ok().body(List.of(normalTasks, urgentTasks));
    }
}

