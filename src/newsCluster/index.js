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

function solution(str1, str2) {
  let arr1 = changeForm(str1);
  let arr2 = changeForm(str2);
  let same = [];
  let all = [...new Set(arr1.concat(arr2))];

  if (arr1.length === 0 && arr2.length === 0) {
    return 65536;
  }

  for (let i = 0; i < arr1.length; i++) {
    for (let j = 0; j < arr2.length; j++) {
      if (arr1[i] === arr2[j]) {
        same.push(arr1[i]);
      }
    }
  }
  same = [...new Set(same)];
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

const str1 = "aa1+aa2";
const str2 = "AA12";
console.log(solution(str1, str2));
