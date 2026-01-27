// all paths of the tree - use Backtracking
var binaryTreePaths = function(root) {
    if(!root) return [];
    const res = [];


    // 参数取决于需不需要持续记录什么
    const dfs = (node, path) => {
        if(!node) return;

        // current path
        const curPath = path ? `${path}->${node.val}` : `${node.val}`;

        //1. collect answer
        if(!node.left && !node.right){
            res.push(curPath);
        }

        // continue dfs
        if(node.left) dfs(node.left, curPath);
        if(node.right) dfs(node.right, curPath);
    }   

    dfs(root, '')
    return res
};