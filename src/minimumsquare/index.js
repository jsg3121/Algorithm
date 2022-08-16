// 현재 배열에서 최대값 검색
// 길이가 큰 값중 최대값, 길이가 작은 값중 최대값

function solution(sizes) {
  let maxW = 0
  let maxH = 0

  for (let i = 0; i < sizes.length; i++) {
    let sort = sizes[i].sort((a, b) => a - b)
    if (maxW <= sort[0]) {
      maxW = sort[0]
    }

    if (maxH <= sort[1]) {
      maxH = sort[1]
    }
  }
  return maxW * maxH
}

const size = [
  [14, 4],
  [19, 6],
  [6, 16],
  [18, 7],
  [7, 11],
]

solution(size)
