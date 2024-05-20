CREATE TABLE `CoLibrarianDB`.`Loans` (
  `loan_ID` INT NOT NULL,
  `book_ID` INT NOT NULL,
  `user_ID` INT NOT NULL,
  `loan_Date` DATETIME NOT NULL,
  PRIMARY KEY (`loan_ID`),
  INDEX `book_ID_idx` (`book_ID` ASC) VISIBLE,
  INDEX `user_ID_idx` (`user_ID` ASC) VISIBLE,
  CONSTRAINT `book_ID`
    FOREIGN KEY (`book_ID`)
    REFERENCES `CoLibrarianDB`.`Books` (`book_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_ID`
    FOREIGN KEY (`user_ID`)
    REFERENCES `CoLibrarianDB`.`User` (`user_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);