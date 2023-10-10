function archeryChampion(input) {
  let target = input.shift().split('|');
  let pointsCollected = 0;
  let line = input.shift();
  while (line !== 'Game over') {
    let [command, ...rest] = line.split('@');
    switch (command) {
      case 'Shoot Left':
        let start = Number(rest[0]);
        let length = Number(rest[1]);
        if (start >= target.length) {
          break;
        }
        let digit = start + length;
        if ((digit % Number(target.length)) !== 0) {
          let index = Number(target.length) - (digit % Number(target.length)) ;

          if (Number(target[index]) > 5) {
            target[index] = Number(target[index]) - 5;
            pointsCollected += 5;
          } else {
            pointsCollected += Number(target[index]);
            target[index] = 0;
          }

        } else {
          if (Number(target[index]) > 5) {
            target[index] = Number(target[index]) - 5;
            pointsCollected += 5;
          } else {
            pointsCollected += Number(target[index]);
            target[index] = 0;
          }
        }

        break;

      case 'Shoot Right':
        let begining = Number(rest[0]);
        let end = Number(rest[1]);
        if (begining >= target.length) {
          break;
        }
        let num = begining + end - Number(target.length);
        if ((num % Number(target.length)) !== 0) {
          let indexTwo = num % Number(target.length) ;
          if (Number(target[indexTwo]) > 5) {
            target[indexTwo] = Number(target[indexTwo]) - 5;
            pointsCollected += 5;
          } else {
            pointsCollected += Number(target[indexTwo]);
            target[indexTwo] = 0;
          }

        } else {
          target[indexTwo] = Number(target[indexTwo]) - 5;
          pointsCollected += 5;
        }
        break;

      case 'Reverse':
        target = target.reverse();
        break;

      default:
        break;
    }
    line = input.shift();
  }
  console.log(target.join(' - '));
  console.log(`John finished the archery tournament with ${pointsCollected} points!`);
}
archeryChampion([
  '10|10|10|10|10',
  'Shoot Left@0@2',
  'Shoot Right@4@5',
  'Shoot Right@6@5',
  'Reverse',
  'Game over',
]);