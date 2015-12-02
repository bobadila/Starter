package com.github.eprudnikov.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Vacation {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private Date vacationStart;

    @Column(nullable = false)
    private Date vacationEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Vacation() {}

    public Vacation(Employee employee, Date vacationStart, Date vacationEnd) {
        this.employee = employee;
        this.vacationStart = vacationStart;
        this.vacationEnd = vacationEnd;
    }

    public long getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
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
