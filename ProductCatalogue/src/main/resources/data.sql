insert into product_categories values(101, 'Shirts');
insert into product_categories values(102, 'Pants');
insert into product_categories values(103, 'Socks');
insert into product_categories values(104, 'Caps');
insert into product_categories values(105, 'Ties');

insert into brand values(301, 'Netplay');
insert into brand values(302, 'Allen Solly');
insert into brand values(303, 'Levis');
insert into brand values(304, 'Wrangler');
insert into brand values(305, 'Raymond');

insert into seller values(401, 'M. K. Enterprise', 'Station road, Mumbai');
insert into seller values(402, 'Fashion world', 'MG Road, Bangalore');
insert into seller values(403, 'Big bazar', 'FC road, Pune');


insert into product values(201, 101, 301, 'S', 'White', 34.50);
insert into product values(202, 102, 302, 'M', 'Blue', 44.50);
insert into product values(203, 103, 303, 'L', 'Red', 54.50);
insert into product values(204, 104, 304, 'XL', 'Green', 64.50);
insert into product values(205, 105, 305, 'XXL', 'Black', 74.50);

insert into seller_product_collection values(501, 401, 201, '401-201-10', 10);
insert into seller_product_collection values(502, 401, 202, '401-202-20', 20);
insert into seller_product_collection values(503, 402, 203, '402-203-30', 30);
insert into seller_product_collection values(504, 403, 204, '403-204-40', 40);
insert into seller_product_collection values(505, 403, 205, '403-205-50', 50);