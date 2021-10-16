Select onum, amt
from orders
where amt < any ( select amt
                  from orders, cust
                  where city = 'San Jose' and
                        orders.cnum = cust.cnum);




Select onum, amt
from orders
where amt < ( select max(amt)
                  from orders, cust
                  where city = 'San Jose' and
                        orders.cnum = cust.cnum);