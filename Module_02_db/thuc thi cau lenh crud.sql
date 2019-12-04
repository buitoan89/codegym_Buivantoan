select customernumber, contactlastname, contactfirstname, phone, city 
from customers;

select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where contactfirstname = 'Peter' and city = 'Melbourne';

select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where contactfirstname like '%A%';

select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where customernumber between 103 and 125;

select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where city in ('USA', 'France', 'Spain') ;

select customernumber, contactlastname, contactfirstname, phone, city ,country
from customers 
where country = 'USA' or country = 'France';

select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
order by contactfirstname asc;

select  customernumber, contactlastname, contactfirstname, phone, city 
from customers 
order by contactfirstname desc limit 10 ;

select count(country) as 'Số khách hàng số ở France' 
from customers 
where country = 'France' ;

insert into customers (customernumber, customername, contactfirstname, contactlastname, phone, addressline1, city, country) 
values (501, 'AgileLead', 'Lan', 'Trần', '0978822683', 'Hàm Nghi', 'Hà Nội', 'Việt Nam' );

update customers 
set customername = 'Baane Mini Imports'
where customernumber = 103;

delete from customers
where city = 'Nantes' ;



