package com.github.eprudnikov.repository;

import com.github.eprudnikov.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 02.12.2015.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findById(long id);
    Iterable<Employee> findAll();
}
