CREATE TABLE public.product (
	id int8 NOT NULL,
	toy_name varchar(255) NULL,
	gender_id varchar(5) NULL,
	age_id int8 NULL,
	price float8 NULL,
	avaliability int8 NULL,
	brand varchar(50) NULL,
	CONSTRAINT product_pk PRIMARY KEY (id)
);

INSERT INTO public.product
(id, toy_name, gender_id, age_id, price, avaliability, brand)
VALUES
      (2, '43 Piece dinner Set', 'F', 3, 12.95, 10, 'CoolKidz'),
      (30,'Fisher-Price stroller','F',2,25.99,10,'CoolKidz'),
      (26,'Les Dollie Toffee Apple','F',2,24.95,10,'CoolKißdz');