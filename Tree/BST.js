// binary search tree

const searchNode_recursive = (root, val) => {
  if (!root) return null;
  if (root.val === val) return root;
  return root.val < val
    ? searchBST(root.right, val)
    : searchBST(root.left, val);
};

const searchNode_iterative = (root, val) => {
  let cur = root;

  while (cur) {
    if (cur.val === val) return cur;
    cur = val < cur.val ? cur.left : cur.right;
  }
  return null;
};

// 验证BST
var isValidBST = function (root) {
  const dfs = (node, low, high) => {
    if (!node) return true;

    if (low !== null && node.val <= low) return false;
    if (high !== null && node.val >= high) return false;

    return dfs(node.left, low, node.val) && dfs(node.right, node.val, high);
  };
  return dfs(root, null, null);
};
