const removeOuterParentheses = function (s) {
    let result = "";
    let bracket = [];
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '(') {
            if (bracket.length > 0) {
                result += s[i];
            }
            bracket.push(s[i]);
        } else {
            bracket.pop();
            if (bracket.length > 0) {
                result += s[i];
            }
        }
    }
    return result;
};

let s = "(()())(())";
let result = removeOuterParentheses(s);
console.log(result);
