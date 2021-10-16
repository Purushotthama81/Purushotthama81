Select onum, amt
from orders


where amt > any ( select amt
from orders, cust
where city = ‘London’ and
orders.cnum = cust.cnum);