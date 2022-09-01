package fr.m2i.firstspringproject.controllers;

import fr.m2i.firstspringproject.models.Employee;
import fr.m2i.firstspringproject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return es.getEmployees();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return es.saveEmployee(employee);
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") final Long id) {
        Optional<Employee> employee = es.getEmployee(id);
        if(employee.isPresent()) {
            return employee.get();
        } else {
            return null;
        }
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") final Long id, @RequestBody Employee employee) {
        Optional<Employee> e = es.getEmployee(id);
        if(e.isPresent()) {
            Employee currentEmployee = e.get();

            String firstName = employee.getFirst_name();
            if(firstName != null) {
                currentEmployee.setFirst_name(firstName);
            }
            String lastName = employee.getLast_name();
            if(lastName != null) {
                currentEmployee.setLast_name(lastName);;
            }
            String mail = employee.getMail();
            if(mail != null) {
                currentEmployee.setMail(mail);
            }
            String password = employee.getPassword();
            if(password != null) {
                currentEmployee.setPassword(password);
            }
            es.saveEmployee(currentEmployee);
            return currentEmployee;
        } else {
            return null;
        }
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") final Long id) {
        es.deleteEmployee(id);
    }
}
