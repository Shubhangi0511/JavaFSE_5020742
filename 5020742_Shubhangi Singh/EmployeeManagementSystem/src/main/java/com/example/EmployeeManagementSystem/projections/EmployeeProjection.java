package com.example.EmployeeManagementSystem.projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {
    String getName();
    String getEmail();

    @Value("#{target.department.name}")
    String getDepartmentName();
}
