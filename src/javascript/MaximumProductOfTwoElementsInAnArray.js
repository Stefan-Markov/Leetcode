const maxProduct = function (nums) {
    const [aa, bb] = nums.sort((a, b) => b - a).slice(0, 2);
    return (aa - 1) * (bb - 1);
};

let nums = [3, 4, 5, 2];
let result = maxProduct(nums);

console.log(result);