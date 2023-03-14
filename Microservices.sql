create database db_library;
use db_library;

CREATE TABLE BOOK (
    BOOK_ID varchar(50) NOT NULL,
    BOOK_NAME varchar(255) NOT NULL,
    AUTHOR varchar(255),
    AVAILABLE_COPIES int,
    TOTAL_COPIES int
);


CREATE TABLE SUBSCRIPTION (
    SUBSCRIPTION_NAME varchar(255) NOT NULL,
    DATE_SUBSCRIBED varchar(20),
    DATE_RETURNED varchar(20),
    BOOK_ID varchar(20) NOT NULL
);

select * from BOOK;

select * from SUBSCRIPTION;