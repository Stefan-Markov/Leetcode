const maxProfit = (prices) => {
    let buy = prices[0];
    let maxProfit = 0;
    for (let i = 1; i < prices.length; i++) {
        let price = prices[i];
        if (buy > price) {
            buy = price;
        } else if (price - buy > maxProfit) {
            maxProfit = price - buy;
        }
    }
    return maxProfit;
};

let prices = [7, 1, 5, 3, 6, 4];

let result = maxProfit(prices);
console.log(result);