select person.firstName, person.lastName, addr.city,addr.state from Person person left join Address addr
on person.personId = addr.personId;