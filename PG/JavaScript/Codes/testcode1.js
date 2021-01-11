;(stdin => {
  // Define Function

  // Declare Variable
  const inputs = stdin.toString().trim()
  // .split(', ')

  const ret1 = inputs - 18.0
  const ret2 = inputs - 18.5

  // Main Procedure
  const result = (lines => {})(inputs)

  // Display
  console.log(`${ret1.toFixed(1)} ${ret2.toFixed(1)}`)
})(require('fs').readFileSync('/dev/stdin', 'utf8'))
