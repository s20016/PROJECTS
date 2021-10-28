const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n')

// TODO: Yakan 211028
// const y = [...Array(10).fill(0).keys()]
// const y = [...Array(10).fill(0).entries()]

// const y = [...Array(10).keys()].map(v => v + 1)
// const y = Array.from(Array(10).keys(), v => v + 1)

// git config --global core.editor 'code -w'

const x = lines[0].split(' ')[2]

const S = lines[1].split(' ').slice(0, x).map(Number)
const y = S.reduce((a, b) => a + b)

console.log(y)
