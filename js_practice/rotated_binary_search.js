const rotated_binary_search = (nums, target) => {
  let left = 0,
    right = nums.length - 1;
  // mid doesnt belong to left half or right half
  while (left <= right) {
    // which half is in order
    const mid = Math.floor((left + right) / 2);
    if (nums[mid] === target) return mid;
    // in the half that is in order => whether it belongs to this half
    if (nums[mid] >= nums[left]) {
      if (target >= nums[left] && target < nums[mid]) {
        //[left, mid)
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    } else {
      if (target >= nums[mid] && target < nums[right]) {
        //(mid, right]
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
  }
  return -1;
};
