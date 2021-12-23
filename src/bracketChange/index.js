function solution(p) {
  const loop = (p) => {
    var answer = "";
    let left = 0;
    let right = 0;
    let u = "";
    let v = "";

    if (p === "") {
      return "";
    }

    for (let i = 0; i < p.length; i++) {
      if (p[i] === "(") {
        left++;
        u += p[i];
      } else if (p[i] === ")") {
        right++;
        u += p[i];
      }
      if (left === right && u[0] === "(") {
        console.log(answer);
        console.log(u);
        console.log(v);
        console.log("------------------");
        answer += u;
        v = p.replace(u, "");
        u = "";
        loop(v);
        break;
      } else if (left === right && u[0] === ")") {
        loop(v);
      }
    }
    return answer;
  };
  loop(p);
  // return answer;
}

solution("()))((()");
