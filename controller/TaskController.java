package com.example.gestordetareas.controller;

import com.example.gestordetareas.model.Task;
import com.example.gestordetareas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Crear una nueva tarea
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    // Actualizar una tarea existente
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        Optional<Task> existingTask = taskService.findById(id);
        if (existingTask.isPresent()) {
            Task updatedTask = existingTask.get();
            updatedTask.setTitle(task.getTitle());
            updatedTask.setDescription(task.getDescription());
            updatedTask.setCompleted(task.isCompleted());
            updatedTask.setDueDate(task.getDueDate());
            updatedTask.setAssignedUser(task.getAssignedUser());
            updatedTask.setTags(task.getTags());
            updatedTask.setPriority(task.getPriority());
            updatedTask.setComments(task.getComments());
            return taskService.save(updatedTask);
        }
        return null;
    }

    // Eliminar una tarea
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
    }

    // Obtener todas las tareas
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    // Marcar una tarea como completada
    @PutMapping("/{id}/complete")
    public Task markTaskAsCompleted(@PathVariable Long id) {
        return taskService.markAsCompleted(id);
    }

    // Actualizar la fecha de vencimiento de una tarea
    @PutMapping("/{id}/duedate")
    public Task updateDueDate(@PathVariable Long id, @RequestParam Date dueDate) {
        return taskService.updateDueDate(id, dueDate);
    }

    // Asignar una tarea a un usuario específico
    @PutMapping("/{id}/assign")
    public Task assignUser(@PathVariable Long id, @RequestParam String assignedUser) {
        return taskService.assignUser(id, assignedUser);
    }

    // Agregar etiquetas a una tarea
    @PutMapping("/{id}/tags")
    public Task addTags(@PathVariable Long id, @RequestParam List<String> tags) {
        return taskService.addTags(id, tags);
    }

    // Priorizar una tarea
    @PutMapping("/{id}/priority")
    public Task setPriority(@PathVariable Long id, @RequestParam String priority) {
        return taskService.setPriority(id, priority);
    }

    // Agregar comentarios a una tarea
    @PutMapping("/{id}/comments")
    public Task addComments(@PathVariable Long id, @RequestParam List<String> comments) {
        return taskService.addComments(id, comments);
    }
}
