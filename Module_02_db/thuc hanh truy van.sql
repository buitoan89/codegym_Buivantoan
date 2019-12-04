select productCode, productName, buyPrice, textDescription 
from products 
inner join productlines
on products.productLine = productlines.productLine
where buyPrice > 56.76 and buyPrice < 95.59;

select productCode, productName, buyPrice, quantityInStock, productVendor, productLine  
from products
where productLine = 'Classic Cars' and productVendor = 'Min Lin Diecast'
 