package com.example.gestordetareas.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private Date dueDate;
    private String assignedUser;
    
    @ElementCollection
    private List<String> tags;
    private String priority;

    @ElementCollection
    private List<String> comments;

    // Getters y setters
    // ...
}
