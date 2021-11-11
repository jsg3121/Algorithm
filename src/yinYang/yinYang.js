function solution(absolutes, signs) {
  let answer = 0;
  absolutes.map((item, index) => {
    if (signs[index]) {
      answer += item;
    } else {
      answer += item * -1;
    }
  });
  return answer;
}

const arr1 = [4, 7, 12];
const sign1 = [true, false, true];
const arr2 = [1, 2, 3];
const sign2 = [false, false, true];

console.log(solution(arr1, sign1));
console.log(solution(arr2, sign2));
