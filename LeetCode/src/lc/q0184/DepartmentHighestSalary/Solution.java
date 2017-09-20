/* 
The Employee table holds all employees. Every employee has an Id, a salary, and there is also a column for the department Id.

+----+-------+--------+--------------+
| Id | Name  | Salary | DepartmentId |
+----+-------+--------+--------------+
| 1  | Joe   | 70000  | 1            |
| 2  | Henry | 80000  | 2            |
| 3  | Sam   | 60000  | 2            |
| 4  | Max   | 90000  | 1            |
+----+-------+--------+--------------+
The Department table holds all departments of the company.

+----+----------+
| Id | Name     |
+----+----------+
| 1  | IT       |
| 2  | Sales    |
+----+----------+
Write a SQL query to find employees who have the highest salary in each of the departments. For the above tables, Max has the highest salary in the IT department and Henry has the highest salary in the Sales department.

+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT         | Max      | 90000  |
| Sales      | Henry    | 80000  |
+------------+----------+--------+
*/
package lc.q0184.DepartmentHighestSalary;

public class Solution {
/* 
# Write your MySQL query statement below
select d.Name as Department, e2.Name as Employee, e2.Salary as Salary
from (select DepartmentId, max(Salary) as MaxSalary from Employee group by DepartmentId) as e1,Employee as e2, Department as d
where e1.DepartmentId = e2.DepartmentId and e1.MaxSalary = e2.Salary and e2.DepartmentId = d.Id
*/
}
