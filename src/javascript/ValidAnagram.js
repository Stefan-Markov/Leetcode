function isAnagram(s, t) {
  if (s.length !== t.length) {
    return false;
  }
  s = s.split("").sort()
  t = t.split("").sort()

  for (let i = 0; i < s.length; i++) {
    if (s[i] !== t[i]) {
      return false;
    }
  }
  return true;
}

let s = "anagram";
let t = "nagaram";
let anagram = isAnagram(s, t);
console.log(anagram);