const numberOfSteps = function (num) {
    let steps = 0;

    while (num !== 0) {
        if (num % 2 === 0) {
            num = num / 2;
        } else {
            num = num - 1;
        }
        steps++;
    }
    return steps;
};

let num = 14;
let result = numberOfSteps(num);
console.log(result);

