Select onum, amt
from orders
where odate != '1994-10-06' and
                        amt > ( select min(amt)
                                     from orders
                                     where odate = '1994-10-06');