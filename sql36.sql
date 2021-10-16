Select 'Customer Number ' || cnum "Code "
from cust
where city = 'San Jose'
UNION
select 'Salesperson Number '||snum
from salespeople
where city = 'San Jose'
UNION ALL
select 'Order Number '|| onum
from Orders
where odate = '1994-10-03';