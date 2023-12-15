/*
On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi].
Return the minimum time in seconds to visit all the points in the order given
by points.

You can move according to these rules:

In 1 second, you can either:
move vertically by one unit,
move horizontally by one unit, or
move diagonally sqrt(2) units (in other words, move one unit vertically then one
unit horizontally in 1 second).
You have to visit the points in the same order as they appear in the array.
You are allowed to pass through points that appear later in the order, but these
 do not count as visits.


Example 1:
Input: points = [[1,1],[3,4],[-1,0]]
Output: 7
Explanation: One optimal path is
[1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
Time from [1,1] to [3,4] = 3 seconds
Time from [3,4] to [-1,0] = 4 seconds
Total time = 7 seconds

Example 2:
Input: points = [[3,2],[-2,2]]
Output: 5
*/
package leetcode;

public class Problem1266 {

    public static void main(String[] args) {
        int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
        System.out.println(minTimeToVisitAllPoints(points));
    }

    /**
     * Calculates the minimum time in seconds to visit all the points in the
     * given array of points.
     *
     * @param points the array of points
     * @return the minimum time in seconds to visit all the points
     */
    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            time += maxDistanceBetween(points[i], points[i + 1]);
        }
        return time;
    }

    /**
     * Calculates the maximum distance between two points in a two-dimensional
     * space.
     *
     * @param point1 the coordinates of the first point in the format [x, y]
     * @param point2 the coordinates of the second point in the format [x, y]
     * @return the maximum distance between the two points
     */
    public static int maxDistanceBetween(int[] point1, int[] point2) {
        return Math.max(
                Math.abs(point2[0] - point1[0]),
                Math.abs(point2[1] - point1[1]));
    }
}
