CREATE TABLE category(

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)


);

INSERT INTO category (name, description, image_url, is_active) VALUES ('Laptop', 'This is description for Mobile category', 'CAT_3.png', true);
INSERT INTO category (name, description, image_url, is_active) VALUES ('Mobile', 'This is description for Mobile category', 'CAT_32.png', true);
INSERT INTO category (name, description, image_url, is_active) VALUES ('Television', 'This is description for Mobile category', 'CAT_13.png', true);


CREATE TABLE user_detail(

	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(50),
	contact_number VARCHAR(15),
	CONSTRAINT pk_user_id PRIMARY KEY(id)
	
);

INSERT INTO user_detail (first_name, last_name, role, enabled, password, email, contact_number )
VALUES ('Rafal', 'Pioro', 'ADMIN',true,'admin','pioro@o2.pl', '88888888');

INSERT INTO user_detail (first_name, last_name, role, enabled, password, email, contact_number )
VALUES ('Magda', 'Pioro', 'SUPPLIER',true,'12345','mp@o2.pl', '777777');

INSERT INTO user_detail (first_name, last_name, role, enabled, password, email, contact_number )
VALUES ('Kaska', 'Pioro', 'SUPPLIER',true,'12345','kp@o2.pl', '66666666');

CREATE TABLE product(
	id IDENTITY,
	code VARCHAR(50),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category(id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id)
);

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABC123BC', 'iPhone5s', 'apple', 'This is one of the best phone available',5000,5,true,2,2);

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABC123BCPRDA', 'Samsung S8', 'samsung', 'This is one of the best phone available',8000,3,true,2,2);

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDA231232', 'Macbook', 'apple', 'This is one of the best laptop available',5000,5,true,1,2);

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PR1234DSD', 'Samsung 48', 'samsung', 'This is one of the best ptv available',12000,5,true,3,2);