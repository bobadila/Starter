package com.github.eprudnikov.service;

import com.github.eprudnikov.domain.Employee;
import com.github.eprudnikov.repository.EmployeeRepository;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 02.12.2015.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee findById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

}
