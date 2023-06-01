const countAsterisks = function (s) {
    let barCount = 0;
    let asteriskCount = 0;
    for (let i = 0; i < s.length; i++) {
        let ch = s[i];
        barCount += ch === '|' ? 1 : 0;
        asteriskCount += barCount === 0 && ch === '*' ? 1 : 0;
        barCount = barCount === 2 ? 0 : barCount;
    }
    return asteriskCount;
};

const s = "l|*e*et|c**o|*de|";
let count = countAsterisks(s);
console.log(count);