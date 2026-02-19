class TreeNode {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

const lowest_ancestor = (root, p, q) => {
  const dfs = (node) => {
    if (!node) return null;
    if (node.val === p.val || node.val === q.val) return node;
    const left = dfs(node.left); // p or q in left subtree
    const right = dfs(node.right); // p or q in right subtree
    if (left && right) return node; // the first time dfs detects both left and right
  };
  return dfs(root);
};
