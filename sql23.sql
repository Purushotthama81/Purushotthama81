Select cname
from cust 
where city = 'Rome' and
           rating > ( select max(rating)
                           from cust
                           where city != 'Rome');