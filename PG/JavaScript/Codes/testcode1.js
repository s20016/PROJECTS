(stdin => {
  // Read Input 
  const lines= stdin.toString().split('\n')
  const [d, s] = lines[0].split(' ').map(Number)

  // Code Here
	const x = (d * 1000 * 100) / s >= 10000 ? 'Yes' : 'No'
  console.log(x)

})(require('fs').readFileSync('/dev/stdin', 'utf8'))
