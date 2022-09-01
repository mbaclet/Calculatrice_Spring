package fr.m2i.firstspringproject.services;

import fr.m2i.firstspringproject.models.Employee;
import fr.m2i.firstspringproject.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository er;

    public Optional<Employee> getEmployee(final Long id) {
        return er.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return er.findAll();
    }

    public void deleteEmployee(final Long id) {
        er.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee save = er.save(employee);
        return save;
    }
}
