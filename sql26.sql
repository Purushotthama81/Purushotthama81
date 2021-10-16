Select * from cust
 where rating > any (select rating from cust
                     where city = 'Paris');

Select *
from cust a
where not exists ( select b.rating from cust b
                          where b.city != 'Paris' and
                                b.rating > a.rating);