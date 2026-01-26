/**
 * Build the next array (also known as failure function or prefix table) for KMP algorithm.
 * next[i] represents the length of the longest proper prefix which is also a suffix
 * for the substring pattern[0..i].
 *
 * @param {string} pattern - The pattern string to build the next array for
 * @returns {number[]} - The next array where next[i] is the longest prefix-suffix length
 */
function buildNext(pattern) {
  const next = new Array(pattern.length).fill(0);
  let len = 0; // Length of the previous longest prefix-suffix

  // Start from index 1 since next[0] is always 0
  for (let i = 1; i < pattern.length; i++) {
    // If mismatch, fall back to the previous longest prefix-suffix
    // Keep falling back until we find a match or len becomes 0
    while (len > 0 && pattern[i] !== pattern[len]) {
      len = next[len - 1];
    }
    // If characters match, extend the current prefix-suffix length
    if (pattern[i] === pattern[len]) {
      len++;
    }
    // Store the longest prefix-suffix length for position i
    next[i] = len;
  }

  return next;
}