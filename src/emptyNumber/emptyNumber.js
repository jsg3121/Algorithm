const number1 = [1, 2, 3, 4, 6, 7, 8, 0];
const number2 = [5, 8, 4, 0, 6, 7, 9];

function solution(numbers) {
  var answer = 0;
  let arr = new Array(10).fill(-1);
  for (let i = 0; i < numbers.length; i++) {
    arr[numbers[i]] = 1;
  }

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === -1) {
      answer += i;
    }
  }
  return answer;
}

console.log(solution(number1));
console.log(solution(number2));
