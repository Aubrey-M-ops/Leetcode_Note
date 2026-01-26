// preorder
var preorderTraversal = function(root) {
    const res = [];

    function dfs(node) {
        if (!node) return;
        res.push(node.val);   // root node
        dfs(node.left);       // left
        dfs(node.right);      // right
    }

    dfs(root);
    return res;
};


// inorder
var inorderTraversal = function(root) {
    const res = [];

    function dfs(node) {
        if (!node) return;
        dfs(node.left);        // 左
        res.push(node.val);    // 根
        dfs(node.right);       // 右
    }

    dfs(root);
    return res;
};


// postorder
var postorderTraversal = function(root) {
    const res = [];

    function dfs(node) {
        if (!node) return;
        dfs(node.left);        // 左
        dfs(node.right);       // 右
        res.push(node.val);    // 根
    }

    dfs(root);
    return res;
};