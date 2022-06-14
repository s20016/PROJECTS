const stream = require('fs').readFileSync('/dev/stdin', 'utf8').trim()
const lines = stream.split('\n')

// console.log(lines)

// for (let i = 1; i <= 10; i++) {
//   console.log(i)
// }

const x = [...Array(5).map((v, i) => v + 1)]
console.log(x)
