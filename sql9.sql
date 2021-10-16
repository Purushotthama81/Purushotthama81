Select odate, sum(amt)
from orders a
group by odate
having sum(amt) > ( select max(amt)
                                  from orders b
                                  where a.odate = b.odate
                                  group by odate);
