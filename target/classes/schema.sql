CREATE TABLE IF NOT EXISTS products
(
    product_Id varchar(100) primary key,
    title varchar(20),
    description varchar(20),
    price varchar(10),
    discount varchar(10),
    discounted_price varchar(10)
);