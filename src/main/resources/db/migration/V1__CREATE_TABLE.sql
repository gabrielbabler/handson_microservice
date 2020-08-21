CREATE TABLE beers (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	price DOUBLE NOT NULL,
	description VARCHAR(100) NOT NULL,
	alcohol_by_volume DOUBLE NOT NULL,
	type VARCHAR(50) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (id)
) engine=InnoDB default charset=utf8;
