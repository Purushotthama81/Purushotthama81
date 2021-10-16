Select onum, odate
from orders

where cnum = ( select cnum
                            from cust
                            where cname = ‘Cisnerous’);