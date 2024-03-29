const readLines = (file = '/dev/stdin') => 
  require('fs').readFileSync(file).toString().trim().split('\n')
const identity = value => value
const join = sep => list => list.join(sep)
const split = (sep, fun = identity) => iter => Array.from(iter.split(sep), fun)
const slice = (begin, end) => iter => end === undefined ? iter.slice(begin) : iter.slice(begin, end)
const toInt = s => parseInt(s, 10)
const toStr = n => n.toString()
const toList = fun => iter => Array.from(iter, fun)
const print = fun => value => console.log(fun(value))

const fun = (...args) => {
	// const [[a, b, c], d, e] = toList(split(' ', toInt))(args)
	// return d.slice(0, c).reduce((a, b) => a + b)

	// const a = [50, 50]
	// const m = a.map(v => v * 2)         // 20,40,60,80,100
	// const f = a.filter(v => v > 25)     // 30,40,50
	// const r = a.reduce(add , 10) // 150

	const f = (a, b) => a + b
	const [[N, A, B], AS] = toList(split(' ', toInt))(args)
	return slice(A - 1, B)(AS).reduce(f)
}

const lines =  readLines('./input.txt')
print(identity)(fun(...lines))

