Select cname, sname
from cust, salespeople
where rating >= any ( select rating
                                                  from cust
                                                  where snum = (select snum
                                                                            from salespeople
                                                                            where sname = 'Serres'))
            and sname != 'Serres'
and salespeople.snum = cust.snum;