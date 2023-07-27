public class MaximumDepthOfBinaryTree {

  public static void main(String[] args) {
    Integer[] array = {3, 9, 20, null, null, 15, 7};

    TreeNode treeNode = arrayToTree(array);
    System.out.println(maxDepth(treeNode));
  }

  static TreeNode arrayToTree(Integer[] array) {
    return arrayToTree(array, 0);
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

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    return Math.max(left, right) + 1;
  }


  private static class TreeNode {

    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(Integer val) {
      this.val = val;
    }


    TreeNode(Integer val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
