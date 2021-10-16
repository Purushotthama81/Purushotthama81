Select snum, sname
from salespeople
where exists ( select cnum
                        from cust
                        where salespeople.city = cust.city and
                                   salespeople.snum != cust.snum);