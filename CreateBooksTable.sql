CREATE TABLE `CoLibrarianDB`.`Books` (
  `book_ID` INT NOT NULL,
  `book_author` VARCHAR(45) NOT NULL,
  `book_title` VARCHAR(45) NOT NULL,
  `book_othertitle` VARCHAR(45) NULL,
  `book_email` VARCHAR(45) NULL,
  `book_language` VARCHAR(45) NOT NULL,
  `book_series` VARCHAR(45) NULL,
  `book_subject` VARCHAR(45) NOT NULL,
  `book_contentType` VARCHAR(45) NOT NULL,
  `book_URL` VARCHAR(45) NULL,
  `book_placeOfPublication` VARCHAR(45) NULL,
  `book_publisher` VARCHAR(45) NOT NULL,
  `book_dateOfPublication` INT NOT NULL,
  `book_copyrightDate` INT NOT NULL,
  `book_isbn` BIGINT NOT NULL,
  `book_extent` INT NOT NULL,
  `book_illustrativeContent` VARCHAR(45) NOT NULL,
  `book_color` VARCHAR(45) NOT NULL,
  `book_dimensions` VARCHAR(45) NOT NULL,
  `book_contributor` VARCHAR(45) NOT NULL,
  `book_keywords` VARCHAR(250) NULL,
  `book_notes` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`book_ID`),
  UNIQUE INDEX `book_ID_UNIQUE` (`book_ID` ASC) VISIBLE);