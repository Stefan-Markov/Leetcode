import java.util.ArrayDeque;
import javax.swing.tree.TreeNode;

public class MinimumDepthOfBinaryTree {

  public static void main(String[] args) {
    Object[] root = {3, 9, 20, null, null, 15, 7};

    TreeNode rootNode = new TreeNode((int) root[0]);
    for (int i = 0; i < root.length; i += 3) {
      TreeNode node = new TreeNode((int) root[i]);
      if (root[i + 1] != null && root[i + 2] != null) {
        node.left = new TreeNode((int) root[i + 1]);
        node.right = new TreeNode((int) root[i + 2]);
      }
    }
    minDepth(rootNode);
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
