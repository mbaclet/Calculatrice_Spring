package fr.m2i.firstspringproject.repositories;

import fr.m2i.firstspringproject.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
