DROP TABLE IF EXISTS User;
CREATE TABLE User(uid INT AUTO_INCREMENT, Priv boolean not null default 0, firstName VARCHAR(255) NOT NULL, lastName VARCHAR(255) NOT NULL, username VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL, scorea INT, scoreb INT, scorec INT, Primary key(uid));
