package pdump.pfour;

public class CousinsInBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Result {
        TreeNode parent;
        int depth;

        Result(TreeNode parent, int depth) {
            this.parent = parent;
            this.depth = depth;
        }
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        Result xInfo = findNodeInfo(root, null, x, 0);
        Result yInfo = findNodeInfo(root, null, y, 0);

        // Check if x and y have the same depth but different parents
        return xInfo.depth == yInfo.depth && xInfo.parent != yInfo.parent;
    }

    private static Result findNodeInfo(TreeNode node, TreeNode parent, int value, int depth) {
        if (node == null) {
            return null;
        }

        if (node.val == value) {
            return new Result(parent, depth);
        }

        // Search in the left subtree
        Result leftResult = findNodeInfo(node.left, node, value, depth + 1);
        if (leftResult != null) {
            return leftResult;
        }

        // Search in the right subtree
        return findNodeInfo(node.right, node, value, depth + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        // Example 1
        System.out.println(isCousins(root, 4, 3));  // Output: false

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(5);

        // Example 2
        System.out.println(isCousins(root2, 5, 4));  // Output: true

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);

        // Example 3
        System.out.println(isCousins(root3, 2, 3));  // Output: false
    }
}
