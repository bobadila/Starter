package com.github.eprudnikov.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Vacation {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String employee;

    @Column(nullable = false)
    private Date vacationStart;

    @Column(nullable = false)
    private Date vacationEnd;

    public Vacation() {}

    public Vacation(String employee, Date vacationStart, Date vacationEnd) {
        this.employee = employee;
        this.vacationStart = vacationStart;
        this.vacationEnd = vacationEnd;
    }

    public long getId() {
        return id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Date getVacationStart() {
        return vacationStart;
    }

    public void setVacationStart(Date vacationStart) {
        this.vacationStart = vacationStart;
    }

    public Date getVacationEnd() {
        return vacationEnd;
    }

    public void setVacationEnd(Date vacationEnd) {
        this.vacationEnd = vacationEnd;
    }
}
