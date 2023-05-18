import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {
    public static void main(String[] args) {
        var n = 6;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(List.of(0, 1));
        edges.add(List.of(0, 2));
        edges.add(List.of(2, 5));
        edges.add(List.of(3, 4));
        edges.add(List.of(4, 2));

        List<Integer> smallestSetOfVertices = findSmallestSetOfVertices(n, edges);
        smallestSetOfVertices.forEach(System.out::println);
    }

    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] values = new int[n];

        for (List<Integer> list : edges) {
            Integer integer = list.get(1);
            values[integer]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (values[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
