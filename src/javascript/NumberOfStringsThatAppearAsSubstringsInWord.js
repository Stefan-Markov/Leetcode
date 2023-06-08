const numOfStrings = function (patterns, word) {
    let count = 0;
    for (let i = 0; i < patterns.length; i++) {
        if (word.includes(patterns[i])) {
            count++;
        }
    }
    return count;
};

const data = ["a", "abc", "bc", "d"];
let word = "abc";

let number = numOfStrings(data, word);
console.log(number);

const numOfStringsOneLine = ((patterns, word) => patterns.filter(x => word.includes(x)).length);

let result = numOfStringsOneLine(data, word);
console.log(result);
