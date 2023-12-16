/*
You are given the array paths, where paths[i] = [cityAi, cityBi] means there
exists a direct path going from cityAi to cityBi. Return the destination city,
that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop,
therefore, there will be exactly one destination city.



Example 1:
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is
the destination city.
Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

Example 2:
Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".

Example 3:
Input: paths = [["A","Z"]]
Output: "Z"

Constraints:
1 <= paths.length <= 100
paths[i].length == 2
1 <= cityAi.length, cityBi.length <= 10
cityAi != cityBi
All strings consist of lowercase and uppercase English letters and the space
character.
 */

package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1436 {

    public static void main(String[] args) {
        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo"));

        System.out.println("The destination city is " + destCity(paths));

        paths = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A"));

        System.out.println("The destination city is " + destCity(paths));

        paths = List.of(
                List.of("A", "Z"));

        System.out.println("The destination city is " + destCity(paths));
    }

    /**
     * Returns the destination city, that is, the city without any path outgoing
     * to another city.
     *
     * @param paths The list of paths.
     * @return The destination city.
     */
    public static String destCity(final List<List<String>> paths) {
        // Create a map to store the paths
        Map<String, String> map = new HashMap<>();

        // Iterate through the paths and add them to the map
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        // Start with the first city in the first path
        String city = paths.get(0).get(0);

        // Traverse the map until we reach a city without any outgoing path
        while (map.containsKey(city)) {
            city = map.get(city);
        }

        // Return the destination city
        return city;
    }
}