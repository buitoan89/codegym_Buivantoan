select city, customerName from customers;

select customerName, customers.customerNumber, phone, paymentDate, amount,city 
from customers
inner join payments
on customers.customerNumber = payments.customerNumber
where city = 'Las Vegas';

select customers.customerNumber,customers.customerName,orders.orderNumber,orders.status 
from customers
left join orders
on customers.customerNumber = orders.customerNumber;

select customers.customerNumber,customers.customerName,orders.orderNumber,orders.status 
from customers
left join orders
on  orders.customerNumber = customers.customerNumber
where orderNumber is null;




