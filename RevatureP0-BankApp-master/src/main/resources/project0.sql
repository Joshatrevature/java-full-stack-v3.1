
CREATE TABLE user(
name VARCHAR2(30),
balance FLOAT DEFAULT NULL,
admin BYTE,
approved BYTE,
CONSTRAINT PK_NAME PRIMARY KEY (name)
--CONSTRAINT UK_NAME UNIQUE(name)
);

