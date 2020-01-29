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
