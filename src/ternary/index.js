// 3진수로 변환 -> 몫이 0이 될 때 까지 반복하며 나눴을 때 나오는 나머지를 뒤에서부터 채운다
// 문제에서는 3진수를 뒤집기 때문에 배열에 push로 해도 가능

const changeTernary = (num) => {
  const arr = [];
  while (num / 3 > 0) {
    if (num / 3 !== 0) {
      arr.push(num % 3);
    }
    num = parseInt(num / 3, 10);
  }
  return arr.reverse();
};

const changeBack = (arr) => {
  let result = 0;

  for (let i in arr) {
    if (arr[i] !== 0) {
      result += arr[i] * 3 ** i;
    }
  }

  return result;
};

function solution(n) {
  const tre = changeTernary(n);
  let answer = changeBack(tre);

  return answer;
}

console.log(solution(45));
// console.log(solution(125));
