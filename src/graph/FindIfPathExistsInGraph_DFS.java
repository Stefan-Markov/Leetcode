package graph;

import java.util.ArrayList;
import java.util.List;

public class FindIfPathExistsInGraph_DFS {

  public static void main(String[] args) {
    int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 0}};
    int n = 3;
    int source = 0;
    int destination = 2;

    boolean result = validPath(n, edges, source, destination);
    System.out.println(result);
  }

  public static boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      graph.add(new ArrayList<>());

    }
    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];
      graph.get(u).add(v);
      graph.get(v).add(u);
    }

    return dfs(graph, source, destination, new boolean[n]);

  }

  private static boolean dfs(List<List<Integer>> graph, int src, int dest, boolean[] vis) {
    if (src == dest) {
      return true;

    }
    vis[src] = true;
    for (int i = 0; i < graph.get(src).size(); i++) {
      int e = graph.get(src).get(i);
      if (!vis[e] && dfs(graph, e, dest, vis)) {
        return true;
      }
    }
    return false;
  }
}
