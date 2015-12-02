package com.github.eprudnikov.service;

import com.github.eprudnikov.domain.Vacation;
import com.github.eprudnikov.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 02.12.2015.
 */
@Service
public class VacationServiceImpl implements VacationService {

    @Autowired
    private VacationRepository vacationRepository;

    @Override
    public Iterable<Vacation> findAll() {
        return vacationRepository.findAll();
    }
}
