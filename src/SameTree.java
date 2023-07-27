public class SameTree {

  public static void main(String[] args) {

    TreeNode p = new TreeNode(1);
    p.right = new TreeNode(2);
    p.left = new TreeNode(3);

    TreeNode q = new TreeNode(1);
    q.right = new TreeNode(2);
    q.left = new TreeNode(3);

    System.out.println(isSameTree(p, q));
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    return helper(p, q);
  }

  private static boolean helper(TreeNode p, TreeNode q) {
    if (p == null || q == null) {
      return p == q;
    }
    return p.val == q.val && helper(p.left, q.left) && helper(p.right, q.right);
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
