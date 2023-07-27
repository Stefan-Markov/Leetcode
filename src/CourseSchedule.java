import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

  public static void main(String[] args) {
    var numCourses = 2;
    int[][] prerequisites = new int[][]{{1, 0}};
    System.out.println(canFinish(numCourses, prerequisites));
  }

  public static boolean canFinish(int numCourses, int[][] prerequisites) {
    List<Integer>[] adj = getAdjList(numCourses, prerequisites);

    // Same as problem "Detect Cycle in Directed Graph"
    int[] inDegree = new int[numCourses];
    for (int node = 0; node < numCourses; node++) {
      for (int neighbour : adj[node]) {
        inDegree[neighbour]++;
      }
    }

    Queue<Integer> queue = new ArrayDeque<>();
    for (int node = 0; node < numCourses; node++) {
      if (inDegree[node] == 0) {
        queue.add(node);
      }
    }
    int nodesFound = 0;

    while (!queue.isEmpty()) {
      int node = queue.remove();
      nodesFound++;
      for (int neighbour : adj[node]) {
        inDegree[neighbour]--;
        if (inDegree[neighbour] == 0) {
          queue.add(neighbour);
        }
      }
    }
    return nodesFound == numCourses;
  }

  private static List<Integer>[] getAdjList(int num, int[][] edges) {
    List<Integer>[] adj = new ArrayList[num];
    for (int node = 0; node < num; node++) {
      adj[node] = new ArrayList<>();
    }
    for (int[] edge : edges) {
      adj[edge[0]].add(edge[1]);
    }
    return adj;
  }
}
