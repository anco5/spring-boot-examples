-- ユーザテーブル追加
CREATE TABLE IF NOT EXISTS users(
  id INT NOT  NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  address VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

INSERT INTO users (name, address) VALUES ("foge", "foge@mail.com");