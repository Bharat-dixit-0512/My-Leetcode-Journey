SELECT c.name AS Customers
FROM Customers c
WHERE c.id NOT IN
(SELECT c.id
FROM Customers c
Inner JOIN Orders o
ON c.id = o.customerId)