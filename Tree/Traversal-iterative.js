// preorder
var preorderTraversal = function(root) {
    if (!root) return [];
    const res = [];
    const stack = [root];

    while (stack.length) {
        const node = stack.pop();
        res.push(node.val);

        // 先右后左（因为栈是 LIFO）
        if (node.right) stack.push(node.right);
        if (node.left) stack.push(node.left);
    }

    return res;
};

// inorder
var inorderTraversal = function(root) {
    const res = [];
    const stack = [];
    let cur = root;

    while (cur || stack.length) {
        // reach the most left leaf node
        while (cur) {
            stack.push(cur);
            cur = cur.left;
        }
        // most left
        cur = stack.pop();
        res.push(cur.val);
        // right sub tree
        cur = cur.right;
    }

    return res;
};

// postorder
var postorderTraversal = function(root) {
    if (!root) return [];
    const res = [];
    const stack = [root];

    while (stack.length) {
        const node = stack.pop();
        res.push(node.val);

        if (node.left) stack.push(node.left);
        if (node.right) stack.push(node.right);
    }

    // 中右左 => 左右中
    return res.reverse();
};