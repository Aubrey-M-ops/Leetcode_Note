const binary_search = (arr, target) => {
  let left = 0,
    right = arr.length; // interval: left closed right open
  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    if (arr[mid] === target) return mid;
    if (arr[mid] > target) {
      right = mid;
    } else {
      left = mid + 1; //不包含mid
    }
  }
  return -1;
};

console.log(binary_search([-1, 0, 3, 5, 9, 12], 2));
