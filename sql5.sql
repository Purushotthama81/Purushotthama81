Select cname
from cust a, orders b
where a.cnum = b.cnum and
            odate = ‘1994-10-03’;