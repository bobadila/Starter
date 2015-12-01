create table vacation (
  id bigint auto_increment,
  employee char(40) not null ,
  vacation_start date not null ,
  vacation_end date not null
);