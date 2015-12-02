package com.github.eprudnikov.service;

import com.github.eprudnikov.domain.Employee;

/**
 * Created by user on 02.12.2015.
 */
public interface EmployeeService {
    Employee findById(long id);
    Iterable<Employee> findAll();
}
