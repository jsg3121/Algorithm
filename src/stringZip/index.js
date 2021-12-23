/**
 * 전체 길이의 / 2 만큼 반복
 * 반복되는 횟수 = 글자 수
 * 다음 글자와 일치하면 +1
 * 연속성이 없으면 1을 지운 해당 글자만 출력
 */

function solution(str) {
  let txt = "";
  let size = parseInt(str.length / 2, 10);
  let cnt = 0;
  let keyword;
  let answer = [];

  if (str.length === 1) {
    return 1;
  }

  for (let j = 1; j <= size; j++) {
    txt = "";
    keyword = str.substr(0, j);
    cnt = 0;
    for (let i = 0; i < str.length; i = i + j) {
      if (keyword === str.substr(i, j)) {
        cnt++;
      } else {
        txt += `${cnt === 1 ? "" : cnt}${keyword}`;
        keyword = str.substr(i, j);
        cnt = 1;
      }
    }
    txt = `${txt}${cnt === 1 ? "" : cnt}${keyword}`;
    answer.push(txt.length);
  }
  return Math.min(...answer);
}

solution("a");
