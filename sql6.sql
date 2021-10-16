Select sname, snum
from salespeople
where snum in ( select snum
                             from cust
                             group by snum
                             having count(snum) > 1 );