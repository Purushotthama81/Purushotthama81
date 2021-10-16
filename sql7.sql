Select onum, a.cnum, a.snum, b.snum
from orders a, cust b
where a.cnum = b.cnum and
            a.snum != b.snum;