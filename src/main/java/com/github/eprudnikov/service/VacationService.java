package com.github.eprudnikov.service;

import com.github.eprudnikov.domain.Vacation;

public interface VacationService {
    Iterable<Vacation> findAll();
}
