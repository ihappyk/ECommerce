CREATE TABLE product (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  description varchar(100) NOT NULL,
  quantity INTEGER NOT NULL,
  unit_price DOUBLE NOT NULL,
  PRIMARY KEY (id)
);