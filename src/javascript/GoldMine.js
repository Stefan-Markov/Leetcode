function goldMine(input) {

  let index = 0;
  let locations = Number(input[index]);
  index++;

  for (let i = 0; i < locations; i++) {
    let expectedAverageGold = Number(input[index]);
    index++;
    let days = Number(input[index]);
    index++;
    let totalGold = 0;
    let averageGold = 0;

    for (let j = 0; j < days; j++) {
      let goldPerDay = Number(input[index]);
      index++;
      totalGold += goldPerDay;
    }
    averageGold = totalGold / days;
    if (averageGold >= expectedAverageGold) {
      console.log(`Good job! Average gold per day: ${averageGold.toFixed(2)}.`);
    } else {
      let difference = Math.abs(expectedAverageGold - averageGold);
      console.log(`You need ${difference.toFixed(2)} gold.`);
    }
  }
}

goldMine([2, 10, 3, 10, 10, 11, 20, 2, 20, 10])