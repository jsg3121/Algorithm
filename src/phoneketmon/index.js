const arr1 = [3, 1, 2, 3];
const arr2 = [3, 3, 3, 2, 2, 4];
const arr3 = [3, 3, 3, 2, 2, 2];

function solution(nums) {
  const half = nums.length / 2;
  const size = new Set(nums).size;

  if (half >= size) {
    return size;
  }

  return half;
}

console.log(solution(arr1));
console.log(solution(arr2));
console.log(solution(arr3));
