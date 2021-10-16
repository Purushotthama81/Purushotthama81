Select a.cname, decode(a.city,b.city,'Matched','Not Matched')
from cust a, salespeople b
where a.snum = b.snum;