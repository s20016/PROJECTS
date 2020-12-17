(stdin => {
  const inputs = stdin.toString().trim().split('\n')
  const l = []

  for (i = 1; i < Number(inputs) + 1; i++) {
    const x = (i % 3 === 0 & i % 5 === 0)
      ? l.push("Fizz Buzz")
      : (i % 3 === 0) 
      ? l.push("Fizz")
      : (i % 5 === 0)
      ? l.push("Buzz") : i
  }
  
  // Display
  console.log(l)

})(require('fs').readFileSync('/dev/stdin', 'utf8'))
