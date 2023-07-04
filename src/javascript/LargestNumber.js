const largestNumber = function (nums) {
  nums.sort((a, b) => {
    let sa = a.toString()
    let sb = b.toString()
    return Number.parseInt(sa + sb) > Number.parseInt(sb + sa) ? -1 : 1
  })
  if (nums[0] === 0) {
    return '0'
  }

  return nums.join('')
};
const nums = [10, 2];
console.log(largestNumber(nums));