CREATE TABLE IF NOT EXISTS Payroll(
    code varchar(100) not null,
    name varchar(255) not null,
    constraint pk_payroll PRIMARY KEY (code)
);

CREATE TABLE IF NOT EXISTS Modality(
    code varchar(100) not null,
    name varchar(255) not null,
    constraint pk_modality PRIMARY KEY (code)
);

CREATE TABLE IF NOT EXISTS Employee(
    code varchar(100) not null,
    name varchar(255) not null,
    last_name_f varchar(255) not null,
    last_name_m varchar(255) not null,
    payroll varchar(100) not null,
    modality varchar(100) not null,
    constraint pk_employee   PRIMARY KEY (code),
    constraint fk_payroll FOREIGN KEY (payroll) REFERENCES Payroll(code),
    constraint fk_modality FOREIGN KEY (modality) REFERENCES Modality(code)
);


CREATE TABLE IF NOT EXISTS Registration(
    id varchar(100) not null,
    entry_date DATE not null,
    entry_time TIME not null,
    departure_time TIME default null,
    employeeCode varchar(100) not null,
    constraint pk_registration PRIMARY KEY (id),
    constraint fk_employe_registration FOREIGN KEY (employeeCode) REFERENCES Employee(code)
);

CREATE TABLE IF NOT EXISTS Administrator(
    id varchar(100) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    employeeCode varchar(100) not null,
    constraint pk_administrator PRIMARY KEY (id),
    constraint fk_employe_administrator FOREIGN KEY (employeeCode) REFERENCES Employee(code)
);

CREATE VIEW report
AS SELECT
           r.id,
           r.entry_date ,
           r.entry_time,
           r.departure_time,
           e.name as name_employee,
           e.last_name_f,
           e.last_name_m,
           py.name as name_payroll,
           md.name as name_modality
FROM  Registration r
    INNER JOIN Employee e ON r.employeeCode = e.code
    INNER JOIN Payroll py ON e.payroll = py.code
    INNER JOIN Modality md ON e.modality = md.code