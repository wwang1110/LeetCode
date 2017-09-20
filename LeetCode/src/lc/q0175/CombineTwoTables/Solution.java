/* Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
 * PersonId is the primary key column for this table.
 * Table: Address

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
 * AddressId is the primary key column for this table.

 * Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

 * FirstName, LastName, City, State
 * 
 */

package lc.q0175.CombineTwoTables;

public class Solution {
/*
# Write your MySQL query statement below
select a.FirstName as FirstName, 
       a.LastName as LastName,
       b.City as City,
       b.State as State
from Person as a
left join Address as b
on a.PersonId = b.PersonId;
*/
}
