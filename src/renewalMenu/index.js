/**
 * - 최소 두가지 이상의 단품메뉴
 * - 최소 2명 이상의 손님으로부터 주문된 단품 메뉴 조합에 대해서만 메뉴후보에 포함
 * - 코스 인덱스 숫자로 조합
 * - 조합된 데이터 배열에 넣기
 * - 가장 많이 중복된 데이터 표시
 * - 같은 횟수면 모두 표시
 * - 오름차순으로 정렬
 * - 인덱스 숫자만큼 길이의 문자열이 1개만 있을 경우 버림
 */
function solution(orders, course) {
  var answer = [];
  let result = [];
  let obj = {};
  for (let i = 0; i < course.length; i++) {
    for (let j = 0; j < orders.length; j++) {
      const arr = orders[j].split("").sort();
      obj = {};
      console.log(arr.length, course[i]);
      if (arr.length >= course[i]) {
        answer.push(combination(arr, course[i]));
      }
      const res = answer.join().split(",");
      for (let i = 0; i < res.length; i++) {
        obj[res[i]] = (obj[res[i]] || 0) + 1;
      }
    }
    console.log(obj);
    const keys = Object.values(obj);
    let max = Math.max(...keys);
    for (let i of Object.keys(obj)) {
      if (obj[i] === max && max !== 1) {
        result.push(i);
      }
    }
    answer = [];
  }
  console.log(result.sort());
  return result.sort();
}

const combination = (arr, num) => {
  const result = [];

  if (num === 1) {
    return arr.map((item) => [item]);
  }

  arr.forEach((fix, index, original) => {
    const rest = original.slice(index + 1);
    const combinate = combination(rest, num - 1);
    const attach = combinate.map((item) => {
      const res = [[fix, ...item].sort().join("")];
      return res;
    });
    result.push(...attach);
  });
  return result;
};

const orders = ["NAB", "BAN", "ANB", "ANB", "ABNE", "AEKL", "AKEP", "QZAE", "AE"];
const course = [2, 3];
solution(orders, course);
