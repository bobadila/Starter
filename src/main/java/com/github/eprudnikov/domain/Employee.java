package com.github.eprudnikov.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 02.12.2015.
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private List<Vacation> vacations;

    public List<Vacation> getVacations() {
        return vacations;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
