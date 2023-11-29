package com.Dev.emp;

import com.Dev.emp.DAO.EmployeeRepository;
import com.Dev.emp.DTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/MyAPI")
public class EmpController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok("Working");
    }

    @PostMapping("/addEmployees")
    public String addEmployees(@RequestBody List<Employee> employeeList) {
        repository.saveAll(employeeList);
        return employeeList.size()+" "+"Added Successfully!";
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Added Successfully!";
    }
    @GetMapping("/getAll")
    public List<Employee> getEmployee(){
        return repository.findAll();
    }
    @GetMapping("/name/{name}")
    public Optional<Employee> searchName(@PathVariable("name") String name){
        return repository.findByFirstName(name);
    }

    @GetMapping("/designation/{designation}")
    public List<Employee> byDesignation(@PathVariable("designation") String designation){
        return repository.findByDesignation(designation);
    }

    @GetMapping("/city/{city}")
    public List<Employee> byCity(@PathVariable("city") String city){
        return repository.findByCity(city);
    }

    @GetMapping("/gender/{gender}")
    public List<Employee> byGender(@PathVariable("gender") String gender){
        return repository.findByGender(gender);
    }

    @GetMapping("/salary/{value}")
    public List<Employee> bySalary(@PathVariable("value") Long salary){
        return repository.findBySalaryGreaterThanEqual(salary);
    }
    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable("id") Long id){
        repository.deleteById(id);
        return "Object Deleted";
    }
    @PutMapping("update")
    public String updateById(@RequestBody Employee employee){
        repository.save(employee);
        return "Updated employee with id "+ employee.getId();
    }
}
