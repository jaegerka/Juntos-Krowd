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
       PHOTO_URL VARCHAR(200),
       CREATED DATE
)

COMMIT;

ALTER TABLE COMMENTS ADD PRIMARY KEY(COMMENT_ID);

COMMIT;

insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (15, 'Raine', 'Kirton', 'rkirton0', 'rkirton0@tiny.cc', 9, 'jBTuWlLjpHBE', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (1, 'Ethelind', 'Flintoff', 'eflintoff0', 'eflintoff0@thetimes.co.uk', 0, 'vR8HZYA5EH', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (2, 'Lauretta', 'Stemson', 'lstemson1', 'lstemson1@irs.gov', 6, 'EqiX4vrjRW', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (3, 'Ed', 'Moresby', 'emoresby2', 'emoresby2@cnet.com', 0, 'eGNggjZ', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (4, 'Lorne', 'Barszczewski', 'lbarszczewski3', 'lbarszczewski3@adobe.com', 7, 'WT7Z9yGiSD', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (5, 'Marylynne', 'Wilbor', 'mwilbor4', 'mwilbor4@csmonitor.com', 6, '8UPZ1l23Tbg', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (6, 'Cyril', 'Guslon', 'cguslon5', 'cguslon5@parallels.com', 2, 'EjkG99', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (7, 'Starr', 'Leads', 'sleads6', 'sleads6@howstuffworks.com', 4, 'JCbgOm6Sq9f', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (8, 'Joanne', 'Malster', 'jmalster7', 'jmalster7@techcrunch.com', 8, '3tf88I', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (9, 'Jolee', 'Nicolls', 'jnicolls8', 'jnicolls8@ifeng.com', 7, 'WQxVk2FGeAmQ', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (10, 'Gothart', 'Caze', 'gcaze9', 'gcaze9@wunderground.com', 7, 'LYaecdo', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (11, 'Nonah', 'Budcock', 'nbudcocka', 'nbudcocka@arizona.edu', 2, 'DRYXL9', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (12, 'Catharine', 'Whybrow', 'cwhybrowb', 'cwhybrowb@google.com', 7, 'zs1JGZQ6', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (13, 'Guinevere', 'Pickard', 'gpickardc', 'gpickardc@zimbio.com', 3, '0AGuJTW6A', null);
insert into USERS (USER_ID, FIRSTNAME, LASTNAME, USERNAME, EMAIL, TOKEN_SCORE, PASSWORD, PHOTO_URL) values (14, 'Terrence', 'Vannacci', 'tvannaccid', 'tvannaccid@businesswire.com', 1, 'wMqfswh', null);

COMMIT;

-- EVENTS FILL FOR TESTIN
insert into EVENTS (EVENT_ID, EVENT_NAME, EVENT_LOCATION, EVENT_DESCRIPTION, EVENT_TYPE, EVENT_DATE, USER_ID, PHOTO_ID, CREATED) values (1, null, '7 Moland Way', null, null, TO_DATE ('2018-02-05 19:45:20','yyyy-mm-dd hh24:mi:ss'), 1, null, TO_DATE ('2018-02-05 19:45:20','yyyy-mm-dd hh24:mi:ss'));

-- COMMENTS FILL FOR TESTING
insert into COMMENTS (COMMENT_ID, DATA , EVENT_ID, CREATED, USER_ID) values (1, null, 1, TO_DATE ('2018-06-09 13:40:32','yyyy-mm-dd hh24:mi:ss'), 16);

COMMIT;

--hello

--PAY ATTENTION PAY ATTENTION PAY ATTENTION PAY ATTENTION PAY ATTENTION PAY ATTENTION PAY ATTENTION PAY ATTENTION PAY ATTENTION
-- @TROY
-- ONLY ADD IF YOU HAVE PHOTO_ID, INSTEAD OF PHOTO_URL

--ALTER TABLE USERS
--MODIFY PHOTO_URL VARCHAR2(200);

--
-- CREATION OF THE JUNCTION TABLE USER_EVENTS
--
-- TABLE ROLE:::
-- USERS WHO FOLLOW EVENTS WILL BE UPDATED TO THIS TABLE 
-- 
-- DATA RETRIEVAL:
-- SEARCH FOR USER FOLLOWING LIST BY SEARCHING WHERE THE EVENT ID IS = TO ?
-- ALL RETURNED DATA DISPLAYS ALL USERS WHO FOLLOW THAT EVENT


CREATE TABLE USER_EVENTS(
    USER_ID NOT NULL,
    EVENT_ID NOT NULL,
    CONSTRAINT PK_USER_EVENTS PRIMARY KEY
    (
    USER_ID,
    EVENT_ID
    ),
    FOREIGN KEY (USER_ID) REFERENCES USERS (USER_ID),
    FOREIGN KEY (EVENT_ID) REFERENCES EVENTS (EVENT_ID)
)
-- TEST SCRIPT FOR PULLING USER/EVENT DATA 
SELECT FIRSTNAME, LASTNAME
FROM USER_EVENTS
JOIN USERS ON USERS.USER_ID = USER_EVENTS.USER_ID
JOIN EVENTS ON EVENTS.EVENT_ID = USER_EVENTS.EVENT_ID;

CREATE TABLE USER_FRIENDS(
    USER_ID NOT NULL,
    FOLLOWING_USER_ID NOT NULL,
    CONSTRAINT PK_USER_FRIENDS PRIMARY KEY
    (
    USER_ID,
    FOLLOWING_USER_ID
    ),
    FOREIGN KEY (USER_ID) REFERENCES USERS (USER_ID),
    FOREIGN KEY (FOLLOWING_USER_ID) REFERENCES USERS (USER_ID)
)
-- TEST SCRIPT FOR PULLING USER/FOLLOWING USER DATA 
SELECT A.FIRSTNAME, A.LASTNAME, B.FIRSTNAME, B.LASTNAME
FROM USER_FRIENDS
JOIN USERS A ON A.USER_ID = USER_FRIENDS.USER_ID
JOIN USERS B ON B.USER_ID = USER_FRIENDS.USER_ID;


INSERT INTO USER_EVENTS (USER_ID, EVENT_ID) VALUES (16,1);

COMMIT;

ALTER TABLE USERS
DROP COLUMN PHOTO_ID;

COMMIT;