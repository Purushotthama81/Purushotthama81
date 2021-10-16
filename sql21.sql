Select sname
from salespeople
where snum in ( select snum from cust

                         where salespeople.city = cust.city and
                                    salespeople.snum = cust.snum);

Select sname
from salespeople
where snum = any ( select snum
                                   from cust
                                               where salespeople.city = cust.city and
                                                           salespeople.snum = cust.snum);