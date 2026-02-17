const bestbuy = (prices) => {
  let buy = prices[0],
    max = -Infinity;
  for (let price of prices) {
    const profit = price - buy;
    buy = price < buy ? price : buy;
    max = profit > max ? profit : max;
  }
  return max;
};

const prices = [7, 6, 4, 3, 1];
console.log(bestbuy(prices));
