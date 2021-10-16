Select a.cnum, max(c.cname)
from orders a, cust c
where a.cnum = c.cnum
group by a.cnum,a.snum
having count(*) < ( select count(*)
                                            from orders b
                                            where a.snum = b.snum)
order by a.cnum;