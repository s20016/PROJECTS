(stdin => {
  // define function

  // declare variables
  const inputs = stdin.toString().split('\n')
  const [a, b, c] = inputs[0].split(' ').map(Number) // 数値に変換

  // ここに処理を書く
  const x = (a < b < c) ? 'Yes' : 'No'
  console.log(x)
})(require('fs').readFileSync('/dev/stdin', 'utf8'))
