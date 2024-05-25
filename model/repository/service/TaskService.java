package com.example.gestordetareas.service;

import com.example.gestordetareas.model.Task;
import com.example.gestordetareas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    public Task markAsCompleted(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task updatedTask = task.get();
            updatedTask.setCompleted(true);
            return taskRepository.save(updatedTask);
        }
        return null;
    }

    public Task updateDueDate(Long id, Date dueDate) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task updatedTask = task.get();
            updatedTask.setDueDate(dueDate);
            return taskRepository.save(updatedTask);
        }
        return null;
    }

    public Task assignUser(Long id, String assignedUser) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task updatedTask = task.get();
            updatedTask.setAssignedUser(assignedUser);
            return taskRepository.save(updatedTask);
        }
        return null;
    }

    public Task addTags(Long id, List<String> tags) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task updatedTask = task.get();
            updatedTask.setTags(tags);
            return taskRepository.save(updatedTask);
        }
        return null;
    }

    public Task setPriority(Long id, String priority) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task updatedTask = task.get();
            updatedTask.setPriority(priority);
            return taskRepository.save(updatedTask);
        }
        return null;
    }

    public Task addComments(Long id, List<String> comments) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            Task updatedTask = task.get();
            updatedTask.setComments(comments);
            return taskRepository.save(updatedTask);
        }
        return null;
    }
}
