const intersection = function (nums1, nums2) {
    let set1 = new Set(nums1);
    let set2 = new Set(nums2);
    let result = [];
    for (let num of set1) {
        if (set2.has(num)) {
            result.push(num);
        }
    }
    return result;
};

let nums1 = [1, 2, 2, 1], nums2 = [2, 2];
console.log(intersection(nums1, nums2));