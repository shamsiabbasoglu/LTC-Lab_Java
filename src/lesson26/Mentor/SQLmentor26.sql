create table sales (
    sale_id serial primary key,
    product_name varchar(50),
    quantity_sold int,
    unit_price decimal
);

select * from sales order by sale_id;

insert into sales (product_name, quantity_sold, unit_price)
values
('Laptop', 15, 1200.00),
('Desktop Computer', 10, 800.00),
('Mechanical Keyboard', 25, 150.00),
('Gaming Mouse', 30, 70.00),
('Monitor', 20, 200.00),
('External Hard Drive', 18, 100.00),
('USB Flash Drive', 40, 15.00),
('Wireless Router', 12, 80.00),
('Graphics Card', 8, 400.00),
('Motherboard', 7, 250.00),
('CPU', 5, 300.00),
('RAM 16GB', 14, 90.00),
('SSD 1TB', 11, 120.00),
('PC Case', 6, 70.00),
('Power Supply Unit', 9, 100.00),
('Cooling Fan', 22, 25.00),
('Laptop Stand', 28, 40.00),
('Webcam', 17, 60.00),
('Headset', 19, 85.00),
('Printer', 5, 150.00),
('3D Printer', 2, 800.00),
('Tablet', 13, 350.00),
('Docking Station', 10, 130.00),
('Bluetooth Speaker', 21, 55.00),
('Smartwatch', 15, 200.00),
('VR Headset', 4, 500.00),
('Wireless Charger', 20, 30.00),
('Network Switch', 8, 60.00),
('Surge Protector', 24, 25.00),
('Smart Home Hub', 7, 100.00);

delete from sales where sale_id = 5;

update sales set quantity_sold = 15 where sale_id = 9;

select avg(s.unit_price) as average_price from sales s;

select max(s.unit_price) as maximum_price from sales s;

select min(s.unit_price) as minimum_price from sales s;

select * from sales where unit_price > 120;

select * from sales order by unit_price;

select sum(quantity_sold) as total_quantity
from sales s;

alter table sales
add column product_category varchar(50);

delete from sales where sale_id > 0;

select * from sales;

insert into sales
values
(101, 'Laptop', 15, 1200, 'Computers');

INSERT INTO sales (product_name, quantity_sold, unit_price, product_category)
VALUES
('Desktop Computer', 10, 800.00, 'Computers'),
('Mechanical Keyboard', 25, 150.00, 'Peripherals'),
('Monitor', 20, 200.00, 'Peripherals'),
('External Hard Drive', 18, 100.00, 'Storage'),
('USB Flash Drive', 40, 15.00, 'Storage'),
('Wireless Router', 12, 80.00, 'Networking'),
('Graphics Card', 8, 400.00, 'Components'),
('Motherboard', 7, 250.00, 'Components'),
('CPU', 5, 300.00, 'Components'),
('RAM 16GB', 14, 90.00, 'Components'),
('SSD 1TB', 11, 120.00, 'Storage'),
('PC Case', 6, 70.00, 'Components'),
('Power Supply Unit', 9, 100.00, 'Components'),
('Cooling Fan', 22, 25.00, 'Components'),
('Laptop Stand', 28, 40.00, 'Accessories'),
('Webcam', 17, 60.00, 'Peripherals'),
('Headset', 19, 85.00, 'Peripherals'),
('Printer', 5, 150.00, 'Peripherals'),
('3D Printer', 2, 800.00, 'Peripherals'),
('Tablet', 13, 350.00, 'Computers'),
('Docking Station', 10, 130.00, 'Accessories'),
('Bluetooth Speaker', 21, 55.00, 'Accessories'),
('Smartwatch', 15, 200.00, 'Accessories'),
('VR Headset', 4, 500.00, 'Peripherals'),
('Wireless Charger', 20, 30.00, 'Accessories'),
('Network Switch', 8, 60.00, 'Networking'),
('Surge Protector', 24, 25.00, 'Accessories'),
('Smart Home Hub', 7, 100.00, 'Networking');

select sum(s.quantity_sold * s.unit_price) as total_turnover from sales s;

select * from sales order by quantity_sold desc limit 5;

select product_category, sum(s.quantity_sold * s.unit_price) as total_turnover
from sales s
group by product_category;