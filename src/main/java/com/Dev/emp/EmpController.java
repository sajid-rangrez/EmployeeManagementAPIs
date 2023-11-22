package com.Dev.emp;

import com.Dev.emp.DAO.EmployeeRepository;
import com.Dev.emp.DTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok("Working");
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody List<Employee> employeeList) {
        repository.saveAll(employeeList);
        return employeeList.size()+" "+"Added Successfully!";
    }

    @GetMapping("/getAll")
    public List<Employee> getEmployee(){
        return repository.findAll();
    }
}
