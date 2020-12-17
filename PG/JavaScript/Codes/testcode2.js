(stdin => {
  const inputs  = stdin.toString().trim().split('\n')
  const line = inputs[0]
  // Display
  console.log(inputs[0] * inputs[1])

})(require('fs').readFileSync('/dev/stdin', 'utf8'))
