Select snum
from cust
group by snum
having count(*) = 1;