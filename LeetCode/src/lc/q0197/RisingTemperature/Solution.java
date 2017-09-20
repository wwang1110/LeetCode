/* Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
* For example, return the following Ids for the above Weather table:
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
 * 
 */
package lc.q0197.RisingTemperature;

public class Solution {
/*
select w1.Id as Id
from Weather as w1, Weather as w2
where DATE_SUB(w1.Date, INTERVAL 1 Day) = w2.Date and w1.Temperature - w2.Temperature > 0
 */
}
