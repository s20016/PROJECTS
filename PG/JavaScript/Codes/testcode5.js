const stream = require('fs').readFileSync('/dev/stdin', 'utf8').trim()
const lines = stream.split('\n')

const [A, B, C, D] = lines[0].split(' ').map(Number)
const X = !((!A && !B) || !C) ^ D

console.log(Number(X))
