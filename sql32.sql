Select snum, city, 'Customer Present'
from salespeople a
where exists ( select snum from cust
               where a.snum = cust.snum and
                     a.city = cust.city)
UNION
select snum, city, 'Customer Not Present'
from salespeople a
where exists ( select snum from cust c
               where a.snum = c.snum and
                     a.city != c.city and
                     c.snum not in ( select snum
                                               from cust
                                           where a.snum = cust.snum and
                                       a.city = cust.city));