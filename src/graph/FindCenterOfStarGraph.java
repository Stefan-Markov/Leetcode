package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FindCenterOfStarGraph {

  public static void main(String[] args) {
    int[][] edges = new int[][]{{1, 2}, {2, 3}, {4, 2}};
    int center = findCenter(edges);

    System.out.println(center);
  }

  public static int findCenter(int[][] edges) {
    List<Integer> nums = new ArrayList<>();
    for (int[] x : edges) {
      nums.add(x[0]);
      nums.add(x[1]);
    }
    int size = nums.size();
    Collections.sort(nums);
    // before actual middle
    Integer a = nums.get((size - 3) / 2);
    // after actual middle
    Integer b = nums.get((size - 1) / 2);

    if (Objects.equals(a, b)) {
      return b;
    } else {
      return nums.get(size / 2);
    }
  }
}
