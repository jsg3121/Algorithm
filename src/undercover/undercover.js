const arr = [
  ["yellowhat", "headgear"],
  ["bluesunglasses", "eyewear"],
  ["green_turban", "headgear"],
];

const arr2 = [
  ["crowmask", "face"],
  ["bluesunglasses", "face"],
  ["smoky_makeup", "face"],
];

const solution = (clothes) => {
  let answer = 1;
  let obj = {};

  clothes.map((item) => {
    if (obj.hasOwnProperty(item[1])) {
      obj[item[1]]++;
    } else {
      obj[item[1]] = 1;
    }
  });
  Object.values(obj).forEach((item) => {
    answer = answer * (item + 1);
  });
  answer--;
  return answer;
};

solution(arr);
