const twoSum = (nums, target) => {
    const dir = {};
    for(let i = 0; i < nums.length; i++){
        const num = nums[i];
        if(dir[target - num]!=null){
            return [dir[target - num], i]
        }else{
            dir[num] = i
        }
    }
    return []
}

const nums1 = [2,7,11,15];
const target = 9

console.log(twoSum(nums1, target))