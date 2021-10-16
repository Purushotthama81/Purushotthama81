Select sname, cname
 from cust, salespeople
 where cust.city = 'London' and
       salespeople.city = 'London' and
       cust.snum = salespeople.snum;