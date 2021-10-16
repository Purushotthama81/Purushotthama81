Select snum, sname, city
from salespeople
where snum in ( select snum
                             from cust
                             group by snum
                             having count(*) > 1);