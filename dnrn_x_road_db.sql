USE DNRN_X_ROAD_DB


CREATE TABLE USER 
(
ID INT NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
EMAIL VARCHAR(20),
PASSWORD VARCHAR(256), 
PRIMARY KEY (ID),
UNIQUE KEY (EMAIL)
)

CREATE TABLE CITIZEN
(
  ID INT  NOT NULL AUTO_INCREMENT,
  FIRST_NAME VARCHAR(20) NOT NULL,
  LAST_NAME VARCHAR(20) NOT NULL,
  SEX VARCHAR(20),
  DOB DATE  NOT NULL,
  FATHERS_NAME VARCHAR(20),
  MOTHERS_NAME VARCHAR(20),
  PRIMARY KEY (ID)
)

CREATE TABLE PLACE_BIRTH
(
  ID INT  NOT NULL AUTO_INCREMENT,
  PROVINCE VARCHAR(45) NOT NULL,
  DISTRICT VARCHAR(45),
  VILLAGE VARCHAR(45),
  DESCRIPTIO VARCHAR(45),
  PRIMARY KEY (ID)
)

CREATE TABLE BIRTH_CERTIFICATE
(
  ID INT  NOT NULL AUTO_INCREMENT,
  REGISTR_DATE DATE  NOT NULL,
  STATE VARCHAR(20),
  CITIZEN_KG VARCHAR(20),
  PLACE VARCHAR(45) NOT NULL,
  ADDRESS VARCHAR(60),
  CITIZEN_ID INT,
  PLACE_BIRTH_ID INT,
  CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (ID),
  FOREIGN KEY (CITIZEN_ID) REFERENCES CITIZEN(ID) ON DELETE CASCADE,
  FOREIGN KEY (PLACE_BIRTH_ID) REFERENCES PLACE_BIRTH(ID)
  PRIMARY KEY (ID)
)