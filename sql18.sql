Select a.snum
from salespeople a, cust b
where b.rating = 300 and
            a.snum = b.snum;