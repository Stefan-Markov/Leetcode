package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExistsInGraph_BFS {

  public static void main(String[] args) {
    int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 0}};
    int n = 3;
    int source = 0;
    int destination = 2;

    boolean result = validPath(n, edges, source, destination);
    System.out.println(result);
  }

  public static boolean validPath(int n, int[][] edges, int s, int d) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }
    boolean[] isVis = new boolean[n];
    bfs(s, graph, isVis);
    return isVis[d];
  }

  public static void bfs(int s, List<List<Integer>> graph, boolean[] isVis) {
    Queue<Integer> data = new LinkedList<>();
    data.add(s);
    isVis[s] = true;
    while (!data.isEmpty()) {
      int currVertex = data.poll();
      for (int i = 0; i < graph.get(currVertex).size(); i++) {
        int curr = graph.get(currVertex).get(i);
        if (!isVis[curr]) {
          isVis[curr] = true;
          data.add(curr);
        }
      }
    }

  }
}
