class TreeNode {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

const invert_tree = (root) => {
  if (!root) return null;

  const tmp = root.left;

  root.left = root.right;
  root.right = tmp;

  if (root.left) invert_tree(root.left);
  if (root.right) invert_tree(root.right);

  return root;
};

const root = new TreeNode(
  4,
  new TreeNode(2, new TreeNode(1), new TreeNode(3)),
  new TreeNode(7, new TreeNode(6), new TreeNode(9)),
);

const printTree = (root) => {
  if (!root) return [];
  const res = [];
  const queue = [root];
  while (queue.length) {
    const node = queue.shift();
    if (node.left) queue.push(node.left);
    if (node.right) queue.push(node.right);
    res.push(node.val);
  }
  console.log(123123, res);
};

printTree(invert_tree(root));
