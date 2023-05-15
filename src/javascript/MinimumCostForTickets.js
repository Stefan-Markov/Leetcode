const mincostTickets = function (days, costs) {
    let dp = [];
    let k = 0;
    for (let i = 1; k < days.length; i++) {
        if (i !== days[k]) {
            dp[i] = dp[i - 1];
        } else {
            let daypass = i - 1 > 0 ? dp[i - 1] + costs[0] : costs[0];
            let weekpass = i - 7 > 0 ? dp[i - 7] + costs[1] : costs[1];
            let monthpass = i - 30 > 0 ? dp[i - 30] + costs[2] : costs[2];

            dp[i] = Math.min(monthpass, Math.min(weekpass, daypass));
            k++;
        }
    }
    k = days[days.length - 1];
    return dp[k];
};

let days = [1, 4, 6, 7, 8, 20];
let costs = [2, 7, 15];

let result = mincostTickets(days, costs);
console.log(result);