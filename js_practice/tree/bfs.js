class TreeNode {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

const bfs = (root) => {
  if (!root) return [];
  const res = [];
  const queue = [root];
  while (queue.length) {
    const level = [];
    const length = queue.length;
    for (let i = 0; i < length; i++) {
      const node = queue.shift();
      level.push(node.val);
      if (node.left) queue.push(node.left);
      if (node.right) queue.push(node.right);
    }
    res.push(level);
  }

  return res;
};
