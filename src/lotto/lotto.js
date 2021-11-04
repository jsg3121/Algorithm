const lotto1 = [44, 1, 0, 0, 31, 25];
const result1 = [31, 10, 45, 1, 6, 19];
const lotto2 = [10, 11, 22, 34, 23, 31];
const result2 = [38, 19, 20, 40, 15, 25];
const lotto3 = [45, 4, 35, 20, 3, 9];
const result3 = [20, 9, 3, 45, 4, 35];

function solution(lottos, win_nums) {
  const grade = [6, 5, 4, 3, 2, 1];
  let cnt = 0;
  let unKnown = 0;

  lottos.forEach((item) => {
    if (item !== 0) {
      win_nums.forEach((value) => {
        if (item === value) {
          cnt++;
        }
      });
    } else {
      unKnown++;
    }
  });
  console.log(cnt, unKnown);
  switch (cnt) {
    case 0:
      return unKnown === 0 ? [6, 6] : [1, 6];
    case 6:
      return [1, 1];
    default:
      return [grade[cnt + unKnown - 1], grade[cnt - 1]];
  }
}

console.log(solution(lotto1, result1));
console.log(solution(lotto2, result2));
console.log(solution(lotto3, result3));
