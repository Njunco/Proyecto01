package com.example.gestordetareas.repository;

import com.example.gestordetareas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}