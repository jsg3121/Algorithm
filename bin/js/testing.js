let p = [["(()())()"], [")("], ["()))((()"]];

solution(p);

function solution(p) {
  let answer = "";

  const balance = (str) => {
    let open = 0,
      close = 0;
    let u = "",
      v = "",
      w = "";

    for (let i = 0; i < str.length; i++) {
      if (str.charAt(i) == "\\(") {
        open++;
      } else if (str.charAt(i) == "\\)") {
        close++;
      }

      if (open == close) {
        u = str.substring(0, i + 1);
        v = str.substring(i + 1, str.length) || "";
        break;
      }
    }

    if (u.charAt(0) == "\\(") {
      return (answer += u);
    } else {
      u.replace(u.substr(0, 1), "\\(");
      if (u.substr(1, 1) == "\\(") {
        u.replace(u.substr(1, 1), "\\)");
        u.replace(u.substr(-1, 1), "\\(");
      } else {
        u.replace(u.substr(1, 1), "\\(");
        u.replace(u.substr(-1, 1), "\\)");
      }
      u.replace(u.substr(-1, 1), "\\)");
      return (answer += u);
    }
  };

  answer += balance(p);

  return answer;
}
