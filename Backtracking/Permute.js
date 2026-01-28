// 46 Permutations

// 78 Subsets

// 39 Combination Sum

// 22 Generate Parentheses

// 17 Letter Combinations 




/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    const res = [], path = [], used = new Array(nums.length).fill(false);

    const backtrack = () => {
        if(path.length === nums.length){
            res.push([...path])
            return;
        }

        for(let i = 0; i < nums.length; i++){
            if(used[i]) continue;

            path.push(nums[i])
            used[i] = true;

            backtrack()

            path.pop();
            used[i] = false;
        }
    }

    backtrack()
    return res    
    
};


//模版
// function backtrack(状态参数...) {
//     if (满足结束条件) {
//         收集结果;
//         return;
//     }

//     for (选择 in 当前可选集合) {
//         做选择（修改状态）;
//         backtrack(更新后的状态);
//         撤销选择（恢复状态）;
//     }
// }