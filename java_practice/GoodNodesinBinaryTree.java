package java_practice;

public class GoodNodesinBinaryTree {
    private int count;

    public void dfs(TreeNode root, int max) {
        if (root == null)
            return;
        if (root.val >= max) {
            max = root.val;
            System.out.println(">>>" + root.val);
            count++;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return count;
    }

    public static void main(String[] args) {
        GoodNodesinBinaryTree solver = new GoodNodesinBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println(solver.goodNodes(root));

    }

}
