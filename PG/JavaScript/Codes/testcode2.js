// Read Input
const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n')
const [A, B] = lines[0].split(' ').map(Number)

// Code Here
console.log(A && B)
