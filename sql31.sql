Select a.amt, a.odate, b.amt, b.odate
from orders a, orders b
where (a.amt, b.amt) in (select max(amt), min(amt)
    from orders
                                        group by snum);