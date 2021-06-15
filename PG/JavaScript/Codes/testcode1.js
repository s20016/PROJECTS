process.stdin.resume()
process.stdin.setEncoding('utf8')
const lines = []
const reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
})
reader.on('line', (line) => {
  lines.push(line)
})
reader.on('close', () => {
  const [a, b] = lines

  let msg = ''
  if (a === b) {
    msg = 'OK'
  } else {
    msg = 'NG'
  }

  const msg = (lines[0] === lines[1]) ? 'OK' : 'NG'

  // const msg = ['NG', 'OK'][Number(a === b)]

  console.log(msgg
  // console.log(lines[1])
})
