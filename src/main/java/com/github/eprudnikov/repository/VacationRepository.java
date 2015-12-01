package com.github.eprudnikov.repository;

import com.github.eprudnikov.domain.Vacation;
import org.springframework.data.repository.CrudRepository;

public interface VacationRepository extends CrudRepository<Vacation, Long> {
}
