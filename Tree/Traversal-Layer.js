const rightSideView = function (root) {
  const res = [],
    queue = [root];
  if (!root) return [];
  while (queue.length) {
    const layerLen = queue.length;
    const level = [];
    for (let i = 0; i < layerLen; i++) {
      const node = queue.shift();
      if (node.left) queue.push(node.left);
      if (node.right) queue.push(node.right);
      level.push(node.val);
    }
    res.push(level);
  }
  return res;
};
