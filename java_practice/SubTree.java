package java_practice;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SubTree {
    private static void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("(#)");
            return;
        }
        sb.append("(").append(root.val).append(")");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        serialize(root, sb1);
        serialize(subRoot, sb2);
        return sb1.toString().contains(sb2.toString());
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(12);
        // root1.left = new TreeNode(4);
        // root1.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        // root2.left = new TreeNode(2);
        // root2.right = new TreeNode(3);
        // root2.left.left = new TreeNode(4);
        // root2.left.right = new TreeNode(5);

        System.out.println(isSubtree(root2, root1));
    }

}
