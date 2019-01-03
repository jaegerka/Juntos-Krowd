CREATE USER juntos
IDENTIFIED BY juntos2

QUOTA 10M ON users;

GRANT CREATE SESSION GRANT ANY PRIVILEGE TO juntos;

GRANT connect to juntos;
GRANT resource to juntos;
GRANT create session TO juntos;
GRANT create table TO juntos;
GRANT create view TO juntos;

conn juntos/juntos2


CREATE TABLE USERS (
       USER_ID INT PRIMARY KEY,
       FIRSTNAME VARCHAR(30),
       LASTNAME VARCHAR(30),
       USERNAME VARCHAR(30),
       EMAIL VARCHAR(30),
       TOKEN_SCORE INT,
       PASSWORD VARCHAR(30),
       PHOTO_ID INT
)

CREATE SEQUENCE user_seq START WITH 1;
CREATE OR REPLACE TRIGGER USER_ID_CREATOR
BEFORE INSERT ON USERS
FOR EACH ROW

BEGIN
SELECT user_seq.NEXTVAL
INTO   :new.user_id
FROM   dual;
END;

create table COMMENTS (
	COMMENT_ID INT PRIMARY KEY,
	DATA VARCHAR(250),
	EVENT_ID INT,
    CREATED DATE,
    USER_ID INT;
);
/

ALTER TABLE COMMENTS
    ADD FOREIGN KEY (EVENT_ID)
    REFERENCES EVENTS (EVENT_ID);
    
ALTER TABLE COMMENTS 
    ADD FOREIGN KEY (USER_ID)
    REFERENCES USERS (USER_ID);

COMMIT;

CREATE TABLE EVENTS (
       EVENT_ID INT PRIMARY KEY,
       EVENT_NAME VARCHAR(30),
       EVENT_LOCATION VARCHAR(30),
       EVENT_DESCRIPTION VARCHAR(30),
       EVENT_TYPE VARCHAR(30),
       EVENT_DATE DATE,
       USER_ID INT,
       PHOTO_ID INT,
       CREATED DATE
)

COMMIT;

ALTER TABLE COMMENTS ADD PRIMARY KEY(COMMENT_ID);

COMMIT;


insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (1, 'Raine', 'Kirton', 'rkirton0', 'rkirton0@tiny.cc', 9, 'jBTuWlLjpHBE', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (1, 'Ethelind', 'Flintoff', 'eflintoff0', 'eflintoff0@thetimes.co.uk', 0, 'vR8HZYA5EH', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (2, 'Lauretta', 'Stemson', 'lstemson1', 'lstemson1@irs.gov', 6, 'EqiX4vrjRW', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (3, 'Ed', 'Moresby', 'emoresby2', 'emoresby2@cnet.com', 0, 'eGNggjZ', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (4, 'Lorne', 'Barszczewski', 'lbarszczewski3', 'lbarszczewski3@adobe.com', 7, 'WT7Z9yGiSD', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (5, 'Marylynne', 'Wilbor', 'mwilbor4', 'mwilbor4@csmonitor.com', 6, '8UPZ1l23Tbg', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (6, 'Cyril', 'Guslon', 'cguslon5', 'cguslon5@parallels.com', 2, 'EjkG99', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (7, 'Starr', 'Leads', 'sleads6', 'sleads6@howstuffworks.com', 4, 'JCbgOm6Sq9f', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (8, 'Joanne', 'Malster', 'jmalster7', 'jmalster7@techcrunch.com', 8, '3tf88I', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (9, 'Jolee', 'Nicolls', 'jnicolls8', 'jnicolls8@ifeng.com', 7, 'WQxVk2FGeAmQ', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (10, 'Gothart', 'Caze', 'gcaze9', 'gcaze9@wunderground.com', 7, 'LYaecdo', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (11, 'Nonah', 'Budcock', 'nbudcocka', 'nbudcocka@arizona.edu', 2, 'DRYXL9', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (12, 'Catharine', 'Whybrow', 'cwhybrowb', 'cwhybrowb@google.com', 7, 'zs1JGZQ6', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (13, 'Guinevere', 'Pickard', 'gpickardc', 'gpickardc@zimbio.com', 3, '0AGuJTW6A', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_ID) values (14, 'Terrence', 'Vannacci', 'tvannaccid', 'tvannaccid@businesswire.com', 1, 'wMqfswh', null);


