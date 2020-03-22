CREATE TABLE Beers (
	`id` 			int 		NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
	`name` 			varchar (20) 	NOT NULL UNIQUE,
	`price` 		double 		NOT NULL
);
