
Select max(b.cname), max(b.rating), a.cnum
from orders a, cust b
where a.cnum = b.cnum
group by a.cnum
having count(a.cnum) > ( select avg(count(cnum))
        from orders
                                           group by cnum);