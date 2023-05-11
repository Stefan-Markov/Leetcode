const leftRigthDifference = function (nums) {
    let i;
    let result = [];

    let left = 0;
    let right = 0;

    for (i = 0; i < nums.length; i++) {
        right += nums[i];
    }

    for (i = 0; i < nums.length; i++) {
        right -= nums[i];
        result.push(Math.abs(left - right));
        left += nums[i];
    }
    return result;
};

let nums = [10, 4, 8, 3];
let result = leftRigthDifference(nums);
console.log(result);