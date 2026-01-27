// Iterative
const isSymmetric = (root) => {
  if (!root) return true;
  const queue = [root.left, root.right];
  while (queue.length) {
    const left = queue.shift();
    const right = queue.shift();
    if (!left && !right) continue;
    if (!left || !right) return false;
    if (left.val !== right.val) return false;
    queue.push(...[left.left, right.right, left.right, right.left]);
  }
  return true;
};

// Recursive

const compare = (left, right) => {
  if (!left && !right) return true;
  if (!left || !right) return false;
  if (left.val !== right.val) return false;
  return compare(left.left, right.right) && compare(left.right, right.left);
};

const _isSymmetric = (root) => {
  if (!root) return true;
  return compare(root.left, root.right);
};
