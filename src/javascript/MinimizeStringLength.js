const minimizedStringLength = function (s) {
  return new Set([...s]).size;
};

let s = "aaabc";
let res = minimizedStringLength(s);
console.log(res);


