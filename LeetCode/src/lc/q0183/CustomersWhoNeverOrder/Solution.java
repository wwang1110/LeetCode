/* 
Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.

Table: Customers.

+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Table: Orders.

+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
Using the above tables as example, return the following:

+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
*/

package lc.q0183.CustomersWhoNeverOrder;

public class Solution {
/* 
# Write your MySQL query statement below

select Name as Customers
from (select c.Name as Name, c.Id as Id, o.Id as OrderId from Customers as c left join Orders as o on c.Id = o.CustomerId) as T
where OrderId is null
*/
}
