Select a.snum
from salespeople a
where exists ( select b.snum
                         from cust b
                         where b.rating = 300 and
                                    a.snum = b.snum)