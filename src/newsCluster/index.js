/**
 * 자카드 유사도 : (교집합 크기 / 합집합 크기)
 * 두 집합이 공집합일경우 1
 * 중복된 원소인 경우 합치지 않음
 *
 * 1. 문자에서 공백, 특수문자를 제외한다 (숫자 포함)
 * 2. 문자가 들어오면 2글자씩 나눈다
 * 3. 모두 대문자로 변경한다
 * 4. 모든 원소가 같으면 1 return
 */

const changeForm = (str) => {
  const arr = [];
  const data = str.toUpperCase();
  for (let i = 0; i < data.length - 1; i++) {
    if (new RegExp(/[^a-z]/gi).test(data.substr(i, 2)) === false) {
      arr.push(data.substr(i, 2));
    }
  }
  return arr;
};

const allZip = (arr1, arr2, same) => {
  if (JSON.stringify(arr1) === JSON.stringify(same)) {
    return arr2;
  }
  if (JSON.stringify(arr2) === JSON.stringify(same)) {
    return arr1;
  }
  return [...arr1.filter((x) => !arr2.includes(x)).concat(arr2)];
};

function solution(str1, str2) {
  let arr1 = changeForm(str1);
  let arr2 = changeForm(str2);
  let same = arr1.filter((x) => arr2.includes(x));
  let all = allZip(arr1, arr2, same);

  if (arr1.length === 0 && arr2.length === 0) {
    return 65536;
  }

  if (all.length === 1) {
    return parseInt(
      (Math.min(arr1.length, arr2.length) / Math.max(arr1.length, arr2.length)) * 65536,
      10
    );
  }

  if (same.length === all.length) {
    return 65536;
  }

  return parseInt((same.length / all.length) * 65536, 10);
}

const str1 = "as2dfy2";
const str2 = "as3g cdfas";
console.log(solution(str1, str2));
