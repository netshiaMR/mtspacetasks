CREATE SCHEMA `tasksmgdb`;

-- ************************************** `tasksmgdb`.`accounts` **************************************

CREATE TABLE `tasksmgdb`.`accounts`
(
 `accountId`     int NOT NULL ,
 `firstname`     varchar(45) NULL ,
 `lastname`      varchar(45) NULL ,
 `account_group` varchar(12) NOT NULL ,
 `account_type`  varchar(25) NOT NULL ,
 `emails`        varchar(45) NOT NULL ,
 `cell_number`   integer NOT NULL ,
 `account_ref`   varchar(45) NOT NULL ,
 `profile_Image` varbinary(45) NULL ,
 `userid`        int NOT NULL ,
 `taskid`        int NOT NULL ,

PRIMARY KEY (`accountId`)
);

-- ************************************** `tasksmgdb`.`Comments` **************************************

CREATE TABLE `tasksmgdb`.`Comments`
(
 `commentid`   varchar(45) NOT NULL ,
 `commect`     varchar(500) NOT NULL ,
 `docs`        varchar(1000) NULL ,
 `commentDate` datetime NULL ,
 `commectby`   varchar(45) NULL ,
 `userId`      int NOT NULL ,
 `taskRef`     int NOT NULL ,

PRIMARY KEY (`commentid`),
KEY `userIdx` (`userId`),
CONSTRAINT `userIdfk` FOREIGN KEY `userIdx` (`userId`) REFERENCES `tasksmgdb`.`users` (`userId`)
);

-- ************************************** `tasksmgdb`.`tasks`************************************** 

CREATE TABLE `tasksmgdb`.`tasks`
(
 `tasksId`          int NOT NULL ,
 `taskname`         varchar(35) NOT NULL ,
 `task_description` varchar(500) NULL ,
 `created_date`     datetime NOT NULL ,
 `close_date`       datetime NOT NULL ,
 `owner`            varchar(45) NOT NULL ,
 `new_owner`        varchar(45) NULL ,
 `created_by`       varchar(45) NOT NULL ,
 `assigned_to`      varchar(45) NOT NULL ,
 `isaccepted`       tinyblob NULL ,
 `userId`           int NOT NULL ,
 `accountId`        int NOT NULL ,

PRIMARY KEY (`tasksId`),
KEY `fkIdx_349` (`accountId`),
CONSTRAINT `FK_349` FOREIGN KEY `fkIdx_349` (`accountId`) REFERENCES `tasksmgdb`.`accounts` (`accountId`)
);

-- ************************************** `tasksmgdb`.`users`************************************** 

CREATE TABLE `tasksmgdb`.`users` ( `userid` int NOT NULL , `username` varchar(45) NOT NULL , `accesskey` varchar(250) NOT NULL , `isactive` tinyblob NOT NULL , `role` varchar(45) NOT NULL , `accountId` int NOT NULL , `tasksId` int NOT NULL , `log_date` datetime NOT NULL , PRIMARY KEY (`userid`), KEY `accountIdx` (`accountId`), CONSTRAINT `accountIdfk` FOREIGN KEY `accountIdx` (`accountId`) REFERENCES `tasksmgdb`.`accounts` (`accountId`), KEY `tasksIdx` (`tasksId`), CONSTRAINT `tasksIdfk` FOREIGN KEY `tasksIdx` (`tasksId`) REFERENCES `tasksmgdb`.`tasks` (`tasksId`) ) 









