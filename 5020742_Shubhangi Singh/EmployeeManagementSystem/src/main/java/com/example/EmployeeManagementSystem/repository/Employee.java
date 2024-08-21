package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Entity;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.BatchSize;

@Entity
@DynamicUpdate
@DynamicInsert
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    @BatchSize(size = 10)
    private Department department;

}
