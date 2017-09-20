/* Write a SQL query to get the second highest salary from the Employee table.

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
* For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
 * 
 */

package lc.q0176.SecondHighestSalary;

public class Solution {
/*
# Write your MySQL query statement below
SELECT max(Salary) as SecondHighestSalary 
From Employee
WHERE Salary not in (SELECT max(Salary) FROM Employee )
*/
}
