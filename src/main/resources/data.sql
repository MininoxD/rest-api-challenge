

-- Data Payroll

INSERT INTO Payroll values('95443ebc-8b1b-444b-a5c5-4d33e2d91df2','Practicante');
INSERT INTO Payroll values('25f9d4fe-6266-4368-ab93-a2e3d3c6e79e','CAS');
INSERT INTO Payroll values('c4595404-83cd-4ddb-b007-7f73295bc9cd','CAP');

-- Data Modality

INSERT INTO Modality values('9de338c1-f596-4699-a1b6-7f36db7dd561','Remoto');
INSERT INTO Modality values('742dae06-40d8-447a-9d15-594de6b251fb','Mixto');
INSERT INTO Modality values('0fc1d51a-2b79-4ca2-8d2d-ea7463a94911','Presencial');

-- data employees
INSERT INTO Employee values('09d3a628-2784-4ed7-826d-73e58162e890','Luis', 'Enrique','Atencio', '25f9d4fe-6266-4368-ab93-a2e3d3c6e79e','9de338c1-f596-4699-a1b6-7f36db7dd561');
INSERT INTO Employee values('819604c4-bbb8-4656-830f-cd365314f69f','Jheferson', 'Tabraj','Ramirez', '95443ebc-8b1b-444b-a5c5-4d33e2d91df2','742dae06-40d8-447a-9d15-594de6b251fb');

-- Data Administrator
INSERT INTO Administrator(id,email, password,employeeCode) values('ed603925-5d04-49f7-a85e-33a78ed8eeb8','luis_Css3@hotmail.com', '12345678', '09d3a628-2784-4ed7-826d-73e58162e890');

-- Data Registration
INSERT INTO Registration(id, entry_date, entry_time, employeeCode) values('f6c216c4-97bc-4c37-8067-ed9eb71614f0','2021-10-01','23:59:59.9999999','819604c4-bbb8-4656-830f-cd365314f69f');
