Select cname, city, rating
from cust
where rating >= 200

UNION

Select cname, city, rating
from cust
where rating < 200;