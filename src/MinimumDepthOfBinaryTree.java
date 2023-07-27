import java.util.ArrayDeque;

public class MinimumDepthOfBinaryTree {

  public static void main(String[] args) {
    Integer[] root = {3, 9, 20, null, null, 15, 7};

    TreeNode rootNode = arrayToTree(root, 0);
    int i = minDepth(rootNode);
    System.out.println(i);
  }

  static TreeNode arrayToTree(Integer[] array, int index) {
    if (index >= array.length) {
      return null;
    }

    if (array[index] == null) {
      return null;
    }

    return new TreeNode(
        // value
        array[index],
        // left TreeNode
        arrayToTree(array, index * 2 + 1),
        // right TreeNode
        arrayToTree(array, index * 2 + 2)
    );
  }

  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    var queue = new ArrayDeque<TreeNode>();
    queue.offer(root);

    for (var depth = 1; !queue.isEmpty(); depth++) {
      for (var i = queue.size(); i > 0; i--) {
        var node = queue.poll();

        if (node.left == null && node.right == null) {
          return depth;
        }

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
    }
    return -1;
  }

  private static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
