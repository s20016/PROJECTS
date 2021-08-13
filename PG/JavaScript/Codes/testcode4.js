const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n')
const l = Number(lines[0])

const str = "##########\n.........."
for (var i = 0; i < l; i++) console.log(str)

