package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.projections.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@SuppressWarnings("ALL")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDTO(e.name, e.email, e.department.name) " +
           "FROM Employee e WHERE e.name LIKE %:name%")
    List<EmployeeDTO> findEmployeeDTOByName(@Param("name") String name);

    List<EmployeeProjection> findByDepartmentName(String departmentName);

    List<EmployeeDTO> findEmployeeDTOByDepartmentName(String departmentName);
}
