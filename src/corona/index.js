const checking = (arr, x, y) => {
  let res = true;
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr[i].length; j++) {
      if (arr[i][j] === "P") {
        if (Math.abs(x - i) + Math.abs(y - j) <= 2) {
          console.log(Math.abs(x - i) + Math.abs(y - j) <= 2);
          res = false;
        }
      }
    }
  }
  return res;
};

function solution(places) {
  var answer = [];
  let arr = [];
  let check = true;
  for (let i = 0; i < 1; i++) {
    for (let j = 0; j < places[i].length; j++) {
      arr.push(places[i][j].split(""));
    }
  }
  console.log(arr);
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr[i].length; j++) {
      if (arr[i][j] === "P") {
        check = checking(arr, i, j);
        if (!check) {
          answer.push(0);
          break;
        }
      }
    }
  }
  console.log(answer);
  return answer;
}

const test = [
  ["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"],
  ["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"],
  ["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"],
  ["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"],
  ["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"],
];
solution(test);
