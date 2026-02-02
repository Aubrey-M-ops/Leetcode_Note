package java_practice;

public class DiameterOfTree {

    private int maxDiameter = 0;

    private int height(TreeNode root) {
        if (root == null)
            return 0;
        int L = height(root.left);
        int R = height(root.right);
        maxDiameter = Math.max(maxDiameter, L + R);

        return Math.max(L, R) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        //       3
        //      / \
        //     2   2
        //    /     \
        //   1       2
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right.right = new TreeNode(2);

        // NOTE: New一个对象
        DiameterOfTree solver = new DiameterOfTree();
        System.out.println("Diameter: " + solver.diameterOfBinaryTree(root)); // expected: 4
    }
}
