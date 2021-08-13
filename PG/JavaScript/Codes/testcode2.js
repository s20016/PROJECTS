// Read Input
const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n')
const [d, s] = lines[0].split(' ').map(Number)

// Code Here
const x = (d * 1000 * 100) / s >= 10000 ? 'Yes' : 'No'

console.log(x)


