package com.Dev.emp.DAO;

import com.Dev.emp.DTO.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
