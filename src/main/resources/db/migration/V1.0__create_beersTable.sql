CREATE TABLE beers (
	`id` 			int 		NOT NULL AUTO_INCREMENT UNIQUE,
	`name` 			varchar (20) 	NOT NULL,
	`price` 		double 		NOT NULL,
	PRIMARY KEY (id)
);
