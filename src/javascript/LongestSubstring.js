const longestSubstring = function (s, k) {
  let map = {};
  for (let c of s) {
    map[c] = map[c] ? map[c] + 1 : 1;
  }
  let ans = 0;
  while (ans < s.length && map[s.charAt(ans)] >= k) {
    ans++;
  }

  if (ans === s.length) {
    return ans;
  }

  let left = longestSubstring(s.substring(0, ans), k);
  let right = longestSubstring(s.substring(ans + 1), k);

  return Math.max(left, right);
};

const s = "ababbc";
const k = 2;
let i = longestSubstring(s, k);
console.log(i);