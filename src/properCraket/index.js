function solution(s) {
  const sArr = s.split("")
  let open = 0

  if (sArr[0] === ")" || sArr[sArr.length - 1] === "(") {
    return false
  }

  sArr.forEach((char) => {
    if (open >= 0) {
      if (char === "(") {
        open++
      }
      if (char === ")") {
        open--
      }
    }
  })
  return open === 0 ? true : false
}

let s = "()))((()"
solution(s)
