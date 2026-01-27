// construct a tree using postorder and inorder arrays
const buildTree = function (inorder, postorder) {
  // postorder: root => root of the right subtree => root of the left subtree

  // record inorder index
  const idxMap = new Map();
  inorder.forEach((node, index) => idxMap.set(node, index));

  let postIdx = postorder.length - 1;

  const builder = (leftIdx, rightIdx) => {
    if (leftIdx > rightIdx) return null;

    const rootVal = postorder[postIdx--];
    const root = new TreeNode(rootVal);

    const mid = idxMap.get(rootVal);

    root.right = builder(mid + 1, rightIdx);
    root.left = builder(leftIdx, mid - 1);

    return root;
  };

  return builder(0, inorder.length - 1);
};
