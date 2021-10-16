Select snum, count(snum)
from orders
group by snum
having count(snum) > 1;