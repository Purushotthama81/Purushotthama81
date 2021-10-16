select onum, cnum, amt
from orders a
where amt > (  select avg(amt)
from orders b
where a.cnum = b.cnum
group by cnum);