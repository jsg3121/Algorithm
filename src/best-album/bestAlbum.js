const genres = ["classic", "pop", "classic", "classic", "popp"];
const plays = [500, 2500, 150, 800, 2500];

const solution = (genres, plays) => {
  let answer = [];
  let obj = {};
  let gen = [];

  genres.map((item, index) => {
    if (obj.hasOwnProperty(item)) {
      obj[item][0].value += plays[index];
      obj[item].push({
        index: index,
        value: plays[index],
      });
    } else {
      obj[item] = [
        {
          index: 99999,
          value: plays[index],
        },
      ];
      obj[item].push({
        index: index,
        value: plays[index],
      });
    }
    obj[item] = obj[item].sort((a, b) => b.value - a.value).slice(0, 3);
  });
  for (const key in obj) {
    gen.push({ name: key, value: obj[key][0].value });
  }
  gen
    .sort((a, b) => b.value - a.value)
    .forEach((item) => {
      for (let i = 1; i < obj[item.name].length; i++) {
        answer.push(obj[item.name][i].index);
      }
    });

  return answer;
};

solution(genres, plays);
