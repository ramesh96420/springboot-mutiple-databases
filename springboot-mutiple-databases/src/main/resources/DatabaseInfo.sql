--Create the springboot database
mysql> create database springboot;
Query OK, 1 row affected (0.07 sec)

mysql> use springboot;
Database changed
mysql> show tables;
Empty set (0.07 sec)

--Create the microservice database
mysql> create database microservice;
Query OK, 1 row affected (0.00 sec)

--use microservice database
mysql> use microservice;
Database changed
mysql> show tables;
+------------------------+
| Tables_in_microservice |
+------------------------+
| user                   |
+------------------------+
1 row in set (0.00 sec)

mysql> select * from user;
+-----+----------+
| id  | userName |
+-----+----------+
| 123 | Ramesh   |
| 124 | Sam      |
+-----+----------+
2 rows in set (0.01 sec)

--use springboot database
mysql> use springboot;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_springboot |
+----------------------+
| book_details         |
+----------------------+
1 row in set (0.00 sec)

mysql> select * from book_details;
+-----+--------------+
| id  | name         |
+-----+--------------+
| 100 | Spring Boot  |
| 101 | Microservice |
+-----+--------------+
2 rows in set (0.00 sec)
