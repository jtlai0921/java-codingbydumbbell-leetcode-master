package problems;

public class CustomersWhoNeverOrder {
}
/*
SELECT Name as Customers
FROM Customers
WHERE Id NOT IN (SELECT DISTINCT CustomerId FROM Orders)
 */