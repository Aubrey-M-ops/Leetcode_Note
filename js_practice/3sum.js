const three_sum = (nums) => {
  nums.sort((a, b) => a - b);
  const res = [];
  for (let i = 0; i < nums.length - 2; i++) {
    if (nums[i] === nums[i - 1]) continue;
    let left = i + 1,
      right = nums.length - 1;
    const sum = nums[i] + nums[left] + nums[right];
    while (left < right) {
      if (sum === 0) {
        res.push([nums[i], nums[left], nums[right]]);
        left++;
        right--;
        while (nums[left] === nums[left - 1]) left++;
        while (nums[right + 1] === nums[right]) right--;
      } else if (sum > 0) {
        left++;
      } else {
        right--;
      }
    }
  }
  return res;
};

console.log(three_sum([0, 0, 0]));
