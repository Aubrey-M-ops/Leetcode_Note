const valid_parenthese = (s) => {
  const dir = {
    ")": "(",
    "]": "[",
    "}": "{",
  };
  const stack = [];
  for (let char of s) {
    if (Object.values(dir).includes(char)) {
      stack.push(char);
    } else {
      const top = stack.pop();
      if (top !== dir[char]) {
        return false;
      }
    }
  }
  return !stack.length;
};
