drop table if exists product_categories;

create table product_categories(
    category_id bigint not null primary key,
    category_name varchar(256)
);

drop table if exists brand;

create table brand(
    brand_id bigint not null primary key,
    brand_name varchar(256)
);

drop table if exists product;

create table product(
    prod_id bigint not null primary key,
    category_id bigint,
    brand_id bigint,
    prod_size varchar(256),
    prod_color varchar(256),
    prod_price double not null
);

ALTER TABLE product
    ADD FOREIGN KEY (category_id) 
    REFERENCES product_categories(category_id);

ALTER TABLE product
    ADD FOREIGN KEY (brand_id) 
    REFERENCES brand(brand_id);   

drop table if exists seller;

create table seller(
	seller_id bigint not null primary key,
	seller_name varchar(256),
	seller_address varchar(256)
);


drop table if exists seller_product_collection;

create table seller_product_collection(
	collection_id bigint not null primary key,
	seller_id bigint,
	prod_id bigint,
	sku varchar(256),
	no_of_units bigint
);

ALTER TABLE seller_product_collection
    ADD FOREIGN KEY (seller_id) 
    REFERENCES seller(seller_id);
    
ALTER TABLE seller_product_collection
    ADD FOREIGN KEY (prod_id) 
    REFERENCES product(prod_id);
    