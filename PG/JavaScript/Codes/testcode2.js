process.stdin.resume()
process.stdin.setEncoding('utf8')
// 自分の得意な言語で
// Let's チャレンジ！！
const lines = []
const reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
})
reader.on('line', (line) => {
  lines.push(line)
})
reader.on('close', () => {
  const fizzbuzz = n => {
    const isDivide = (n, m) => n % m === 0
    if (isDivide(n, 3) && isDivide(n, 5)) return 'Fizz Buzz'
    if (isDivide(n, 5)) return 'Buzz'
    if (isDivide(n, 3)) return 'Fizz'
    return n
  }

  const N = parseInt(lines[0], 10)
  for (const x in N) {
    console.log(fizzbuzz(x))
  }
})
