package java_practice;

import java.util.*;

public class InvertBinaryTree {
     public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                // swap
                TreeNode tmpNode = node.left;
                node.left = node.right;
                node.right = tmpNode;
                // add left and right
                if(node.left!= null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
        }
        return root;
    }

    private void print(TreeNode root){
        if(root == null) System.out.println("[]");

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                // add left and right
                if(node.left!= null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
        }
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        InvertBinaryTree solver = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        solver.print(root);
        solver.invertTree(root);
        solver.print(root);

    }
}
