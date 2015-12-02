insert into employee (id, name) values (1, 'Peter');
insert into employee (id, name) values (2, 'Michael');
insert into employee (id, name) values (3, 'Sandro');

insert into vacation (employee_id, vacation_start, vacation_end) values (1, sysdate - 10, sysdate + 2);
insert into vacation (employee_id, vacation_start, vacation_end) values (2, sysdate + 365, sysdate + 380);
insert into vacation (employee_id, vacation_start, vacation_end) values (3, sysdate, sysdate + 5);
insert into vacation (employee_id, vacation_start, vacation_end) values (3, sysdate - 2, sysdate + 6);
insert into vacation (employee_id, vacation_start, vacation_end) values (1, sysdate + 1, sysdate + 5);
insert into vacation (employee_id, vacation_start, vacation_end) values (1, sysdate - 100, sysdate + 499);


