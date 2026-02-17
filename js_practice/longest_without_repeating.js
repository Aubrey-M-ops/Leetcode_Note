const longest_without_repeating = (s) => {
  let left = 0,
    max = 0;
  const dir = {};
  for (let right = 0; right < s.length; right++) {
    const char = s[right];

    // if existed && in the window
    if (dir[char]!=null && dir[char] >= left) {
      left = dir[char] + 1;
    }
    dir[char] = right;
    max = Math.max(max, right - left + 1);
  }
  return max;
};

console.log(longest_without_repeating("pwwkew"));
