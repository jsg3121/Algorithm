// - 3개의 조합 중 홀수의 개수는 1개 또는 3개여야 한다
// - 조합 된 숫자가 홀수 일 때 소수인지 판별한다.

/**
 * ! 조합 알고리즘
 * https://velog.io/@devjade/JavaScript%EB%A1%9C-%EC%88%9C%EC%97%B4%EA%B3%BC-%EC%A1%B0%ED%95%A9-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
 */
//------------------------------------------------------------
const arr1 = [2, 7, 8, 9, 4, 10];
const arr2 = [1, 2, 3, 4];
const arr3 = [1, 2, 7, 6, 4];

const combination = (arr, pick) => {
  const result = [];
  if (pick === 1) {
    return arr.map((arr) => [arr]);
  }

  arr.forEach((item, index, original) => {
    const other = original.slice(index + 1);
    const comb = combination(other, pick - 1);
    const attached = comb.map((el) => {
      return [item, ...el];
    });
    result.push(...attached);
  });
  return result;
};

const getNumbers = (arr) => {
  const result = [];
  for (let i in arr) {
    let num = 0;
    for (let j of arr[i]) {
      num += j;
    }
    if (num % 2 === 1) {
      result.push(num);
    }
  }
  return result;
};

const checkPrime = (num) => {
  for (let i = 2; i ** 2 <= num; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
};

const solution = (nums) => {
  var answer = 0;

  const numbers = getNumbers(combination(nums, 3));
  numbers.forEach((num) => {
    const isPrime = checkPrime(num);
    if (isPrime) {
      answer++;
    }
    return;
  });

  return answer;
};

console.log(solution(arr1));
console.log(solution(arr2));
console.log(solution(arr3));
