function solution(record) {
  let answer = [];
  const user = {};

  for (let i = 0; i < record.length; i++) {
    const item = record[i].split(" ");
    switch (item[0]) {
      case "Enter": {
        user[item[1]] = item[2];
        break;
      }
      case "Change": {
        user[item[1]] = item[2];
        break;
      }
    }
  }

  for (let i = 0; i < record.length; i++) {
    const item = record[i].split(" ");
    switch (item[0]) {
      case "Enter": {
        answer.push(`${user[item[1]]}님이 들어왔습니다.`);
        break;
      }
      case "Leave": {
        answer.push(`${user[item[1]]}님이 나갔습니다.`);
        break;
      }
    }
  }
  return answer;
}

const testCase = [
  "Enter uid1234 Muzi",
  "Enter uid4567 Prodo",
  "Leave uid1234",
  "Enter uid1234 Prodo",
  "Change uid4567 Ryan",
];
solution(testCase);
