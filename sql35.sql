Select 'Customer Number ' || cnum "Code ",count(*)
from orders
group by cnum
having count(*) > 1
UNION
select 'Salesperson Number '||snum,count(*)
from orders
group by snum
having count(*) > 1;