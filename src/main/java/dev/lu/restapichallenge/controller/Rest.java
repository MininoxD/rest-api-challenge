package dev.lu.restapichallenge.controller;

import dev.lu.restapichallenge.dao.DAO;
import dev.lu.restapichallenge.model.Employee;
import dev.lu.restapichallenge.model.Registration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Rest {
    private static DAO<Employee> dao;

    public Rest(DAO<Employee> dao) {
        this.dao = dao;
    }

    @GetMapping("/employee")
    public List<Employee> getMessage(){
        List<Employee> employees = dao.list();
        return employees;
    }

    @GetMapping("/employee/{code}")
    public Employee getOneEmpleyee(@PathVariable("code") String code){
        System.out.println(code);
        Optional<Employee> employee = dao.get(code);
        return employee.get();
    }

    @PostMapping("/employee")
    public void insertEmployee(@RequestBody Employee employee){
          System.out.println(employee);
          dao.create(employee);
    }

    @PutMapping("/employee/{code}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable("code") String code){
        System.out.println(employee);
        System.out.println(code);
        dao.update(employee, code);
    }

    @DeleteMapping("/employee/{code}")
    public void deleteEmployee(@PathVariable("code") String code){
        dao.delete(code);
    }

}

