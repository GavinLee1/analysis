SET MODE MySQL;

DROP TABLE if EXISTS user;
CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(60) DEFAULT NULL,
  remark varchar(400) DEFAULT NULL,
  avatar varchar(200) DEFAULT NULL,
  gender tinyint(4) DEFAULT NULL,
  birthday datetime DEFAULT NULL,
  email varchar(40) DEFAULT NULL,
  phone varchar(20) DEFAULT NULL,
  create_time datetime DEFAULT NULL,
  update_time datetime DEFAULT NULL,
  PRIMARY KEY (id)
) DEFAULT CHARSET=utf8;
