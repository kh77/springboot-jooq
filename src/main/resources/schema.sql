CREATE SCHEMA product_management ;

create table IF NOT EXISTS products
(
    id          bigint not null AUTO_INCREMENT PRIMARY KEY,
    description varchar(255),
    name        varchar(255),
    price       decimal(19, 2)
    );


CREATE TABLE IF NOT EXISTS orders (
                                      id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                      product_id BIGINT NOT NULL,
                                      description VARCHAR(255) NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
    );