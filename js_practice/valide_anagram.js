const isValidAnagram = (s, t) => {
  if (s.length !== t.length) return false;
  const count = {};
  for (let char of s) {
    count[char] = (count[char] || 0) + 1;
  }
  for (let char of t) {
    if (!count[char]) {
      return false;
    }
    count[char]--;
  }
  return true;
};

const st = ["raq", "taw"];
console.log(isValidAnagram(st[0], st[1]));
