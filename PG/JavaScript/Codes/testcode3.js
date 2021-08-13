// Read Input
const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n')
const size = Number(lines[0])

// Code Here
const us = size - 18.0
const uk = size - 18.5

const x = [us, uk].map(x => x.toFixed(1))

console.log(x.join(' '))

