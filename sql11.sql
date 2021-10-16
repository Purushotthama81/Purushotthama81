Select distinct cname
from cust a, salespeople b
where a.city = b.city and
           a.snum != b.snum;

Select cname
from cust
where cname in ( select cname
     from cust a, salespeople b
     where a.city = b.city and
                                       a.snum != b.snum );