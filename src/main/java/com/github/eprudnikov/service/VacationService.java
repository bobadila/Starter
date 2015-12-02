package com.github.eprudnikov.service;

import com.github.eprudnikov.domain.Vacation;

/**
 * Created by user on 02.12.2015.
 */
public interface VacationService {
    Iterable<Vacation> findAll();
}
