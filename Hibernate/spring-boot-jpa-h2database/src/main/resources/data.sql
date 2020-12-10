INSERT INTO employee (id,first_name, last_name, address,passport_id) VALUES
  (101,'Aliko', 'Dangote','Boston',601),
  (102,'Bill', 'Gates', 'NY',602),
  (103,'Folrunsho', 'Alakija', 'NC',603);

INSERT INTO passport (id,number) VALUES
  (601,'PASS-01'),
  (602,'PASS-02'),
  (603,'PASS-03');

INSERT INTO salary (id,from_date, to_date, salary, employee_id) VALUES
  (701,TO_DATE('01-01-2018','MM-DD-YYYY'),TO_DATE('12-31-2018','MM-DD-YYYY'),4000,101),
  (702,TO_DATE('01-01-2019','MM-DD-YYYY'),TO_DATE('12-31-2019','MM-DD-YYYY'),4500,101),
  (703,TO_DATE('01-01-2017','MM-DD-YYYY'),TO_DATE('12-31-2017','MM-DD-YYYY'),3500,102),
  (704,TO_DATE('01-01-2018','MM-DD-YYYY'),TO_DATE('12-31-2019','MM-DD-YYYY'),4500,103)
  ;

INSERT INTO certificate (id,name) VALUES
  (801,'Java Certification'),
  (802,'AWS Certification'),
  (803,'Microsoft Certification'),
  (804,'SAP Certification')
  ;

INSERT INTO EMPLOYEE_X_CERTIFICATE(employee_id,certificate_id) VALUES
    (101,801),
    (101,802),
    (101,803),
    (102,803),
    (103,802),
    (103,803),
    (103,804)
    ;