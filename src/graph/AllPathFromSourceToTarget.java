package graph;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSourceToTarget {

  public static void main(String[] args) {

    // [1,2],[3],[3],[]
    int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
    List<List<Integer>> lists = allPathsSourceTarget(graph);
    System.out.println(lists);
  }

  public static class Edge {

    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  public static void path(List<Edge>[] graph, int src, int dest, List<Integer> currentPath,
      List<List<Integer>> result) {
    currentPath.add(src);

    if (src == dest) {
      result.add(new ArrayList<>(currentPath));
    } else {
      for (Edge e : graph[src]) {
        path(graph, e.dest, dest, currentPath, result);
      }
    }

    // Backtrack by removing the last node from the currentPath
    currentPath.remove(currentPath.size() - 1);
  }

  public static ArrayList<Edge>[] create(int[][] graph, int n) {
    ArrayList<Edge>[] grapho = new ArrayList[n];
    for (int i = 0; i < graph.length; i++) {
      grapho[i] = new ArrayList<>();
    }
    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph[i].length; j++) {
        Edge e = new Edge(i, graph[i][j]);
        grapho[i].add(e);
      }
    }
    return grapho;
  }

  public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    int n = graph.length;
    List<Edge>[] g = create(graph, n);

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> currentPath = new ArrayList<>();
    path(g, 0, n - 1, currentPath, result);

    return result;
  }

}
