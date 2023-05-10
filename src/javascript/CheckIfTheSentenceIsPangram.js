const checkIfPangram = function (sentence) {
    let set = new Set();
    for (let i = 0; i < sentence.length; i++) {
        let c = sentence.charAt(i);
        set.add(c);
    }
    return set.size === 26;
};
let sentence = "thequickbrownfoxjumpsoverthelazydog";

let result = checkIfPangram(sentence);
console.log(result);