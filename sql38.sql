Select snum, sname
from salespeople
where snum in ( select snum
   from cust
where cust.snum = salespeople.snum  )