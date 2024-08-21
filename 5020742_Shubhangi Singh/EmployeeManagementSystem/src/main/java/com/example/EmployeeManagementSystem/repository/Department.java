package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.Auditable;
import com.example.EmployeeManagementSystem.model.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    // Getters and Setters
}
