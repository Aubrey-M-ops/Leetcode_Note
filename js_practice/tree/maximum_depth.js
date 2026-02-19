class TreeNode {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

const maximun_depth = (root) => {
  if (!root) return 0;
  const leftDepth = maximun_depth(root.left);
  const rightDepth = maximun_depth(root.right);
  return Math.max(leftDepth, rightDepth) + 1;
};

const root = new TreeNode(
  1,
  new TreeNode(2, new TreeNode(4), new TreeNode(5)),
  new TreeNode(3),
);

console.log(maximun_depth(root));
