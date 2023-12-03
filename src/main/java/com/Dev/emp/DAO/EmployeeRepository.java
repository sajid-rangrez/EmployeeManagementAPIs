package com.Dev.emp.DAO;

import com.Dev.emp.DTO.Employee;
import com.Dev.emp.DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByFirstName(String name);
    List<Employee> findByDesignation(String designation);
    List<Employee> findByCity(String city);
    List<Employee> findByGender(String gender);
    List<Employee> findBySalaryGreaterThanEqual(Long salary);

//    List<Employee> findBySalaryEqualLesserThan(Long salary);
}
