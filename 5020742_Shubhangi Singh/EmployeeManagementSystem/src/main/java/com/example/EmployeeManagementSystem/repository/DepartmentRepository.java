package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@SuppressWarnings("ALL")
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Derived query method to find by name
    Department findByName(String name);

    // Custom query to find department with the most employees
    @Query("SELECT d FROM Department d WHERE d.id = " +
           "(SELECT e.department.id FROM Employee e GROUP BY e.department.id ORDER BY COUNT(e) DESC)")
    default Department findDepartmentWithMostEmployees() {
        return null;
    }
}
