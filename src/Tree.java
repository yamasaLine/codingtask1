import java.util.ArrayList;
import java.util.List;

public class Tree {
    public Tree(TreeNode root) {
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    //TODO implement this method.
    public static List<List<Integer>> levelTranversal(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        var root1 = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        var root2 = new TreeNode(1);
        TreeNode root3 = null;

        var root4 = new TreeNode(12,
                new TreeNode(9, new TreeNode(18, new TreeNode(8), null), null),
                new TreeNode(20, new TreeNode(15), new TreeNode(11, new TreeNode(18), null)));
        //TODO write test caes for the 4 inputs.
    }
}
