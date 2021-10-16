Select * from cust
where 2 < (select count(*)
           from cust
           where city = 'San Jose');