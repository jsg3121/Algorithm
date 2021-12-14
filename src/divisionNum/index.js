// !약수 구하기 : 1부터 해당 숫자까지 반복하며 나머지가 0인 수들

const left = 13;
const right = 17;

const divisor = (num) => {
  let cnt = 0;
  for (let i = 1; i <= num; i++) {
    if (num % i === 0) {
      cnt++;
    }
  }

  if (cnt % 2 === 1) {
    return -1;
  }

  return 1;
};

function solution(left, right) {
  var answer = 0;

  for (let i = left; i <= right; i++) {
    answer += i * divisor(i);
  }

  return answer;
}

console.log(solution(left, right));

console.log(10 + -7);
