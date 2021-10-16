Select a.cnum, a.cname
from cust a
where a.rating = (  select max(rating)
         from cust b
                     where a.city = b.city);