create table employee (
  id bigint auto_increment,
  name char(40) not null,
);

create table vacation (
  id bigint auto_increment,
  employee_id bigint references employee(id),
  vacation_start date not null ,
  vacation_end date not null
);