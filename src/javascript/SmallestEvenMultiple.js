const smallestEvenMultiple = function (n) {
    return n % 2 === 0 ? n : n * 2;
};

let n = 10;

let result = smallestEvenMultiple(n);
console.log(result);