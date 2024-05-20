CREATE TABLE `CoLibrarianDB`.`User` (
  `user_ID` INT NOT NULL,
  `user_name` VARCHAR(250) NOT NULL,
  `user_phone` INT NOT NULL,
  `user_email` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`user_ID`),
  UNIQUE INDEX `ID_UNIQUE` (`user_ID` ASC) VISIBLE);