function giftFromSanta(input) {
  let n = Number(input.shift());
  let m = Number(input.shift());
  let s = Number(input.shift());

  let result = "";
  for (let i = m; i >= n; i--) {
    if (i % 2 === 0 && i % 3 === 0) {
      if (i === s) {
        break;
      }
     result += " " + i;
    }
  }
  console.log(result.trim())
}

giftFromSanta([1,
  30,
  15]);
