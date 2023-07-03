function findTheDifference(s, t) {
  let sArr = s.split("");
  let tArr = t.split("");
  let sObj = {};
  let tObj = {};
  for (const element of sArr) {
    if (sObj[element]) {
      sObj[element]++;
    } else {
      sObj[element] = 1;
    }
  }
  for (const element of tArr) {
    if (tObj[element]) {
      tObj[element]++;
    } else {
      tObj[element] = 1;
    }
  }
  for (let key in tObj) {
    if (sObj[key] !== tObj[key]) {
      return key;
    }
  }
}

const s = "abcd";
const t = "abcde";
let c = findTheDifference(s, t);
console.log(c);