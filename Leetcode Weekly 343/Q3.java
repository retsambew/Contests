import java.util.Arrays;

public class Q3 {
    // Wrong solution
    public int minimumCost(int[] start, int[] target, int[][] specialRoads) {
        int minCost = (target[0] - start[0]) + (target[1] - start[1]);
        int i = 0;
        for (int[] row : specialRoads) {
            int newStart[] = { row[2], row[3] };
            int cost = (row[0] - start[0]) + (row[1] - start[1]) + row[4]
                    + minimumCost(newStart, target, Arrays.copyOfRange(specialRoads, i + 1, specialRoads.length));
            if (cost < minCost)
                minCost = cost;
            i++;
        }
        return minCost;
    }

    public static void main(String[] args) {
        int[] start = { 3, 2 };
        int[] target = { 5, 7 };
        int[][] roads = { { 3, 2, 3, 4, 4 }, { 3, 3, 5, 5, 5 }, { 3, 4, 5, 6, 6 } };
        int a = new Q3().minimumCost(start, target, roads);
        System.out.println(a);
    }
}
