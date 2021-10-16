Select sname
from salespeople
where sname < any ( select cname
           from cust
                                   where salespeople.snum = cust.snum);

Select sname
from salespeople
where exists ( select cname
from cust
                        where salespeople.snum = cust.snum and
                                   salespeople.sname < cust.cname);