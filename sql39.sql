Select sname, cname
from cust, salespeople
where cust.snum= salespeople.snum;

Select sname, cname
from cust, salespeople
where cust.snum = salespeople.snum
UNION
select distinct sname, 'No Customer'
from cust, salespeople
where 0 = (select count(*) from cust
     where cust.snum = salespeople.snum);