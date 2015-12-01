package com.github.eprudnikov.service;

import com.github.eprudnikov.domain.Vacation;
import com.github.eprudnikov.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vacationService")
public class VacationServiceImpl implements VacationService {

    @Autowired
    private VacationRepository vacationRepository;

    @Override
    public Iterable<Vacation> findAll() {
        return vacationRepository.findAll();
    }
}
