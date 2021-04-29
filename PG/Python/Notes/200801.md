## Methods for Reading Input.txt
Updated: August 1, 2020

**Notes:**<br>
- `import sys` when `sys.stdin` is in use.<br>
- `n` = number of lines in input.txt

**1 Line, 1 Input**<br>
```python
# str
x = input()

# int
x = int(input())

# float
x = float(input())
```
#
**1 Line, Multiple Inputs**<br>
```txt
0 1 Hello
```
```python
# may change str to int or float
x, y, z = map(str, input().split())
x, y, z = sys.stdin.readline().split()

print(x, z)
# 0 Hello
```
#
```txt
08 10 Hello 99.9
```
```python
x = input().split()                                 
x = sys.stdin.read().split())

print(x)
# ['08', '10', 'Hello', '99.9']
```
#
```txt
0123Hello
```
```python
x = list(input())

print(x)
# ['0', '1', '2', '3', 'H', 'e', 'l', 'l', 'o']
```

#
**Multiple Lines, Multiple Inputs**<br>
```txt
0
1
2
3
Hello
```
```python
# may wrap input() with int or float
x = [input() for _ in range(n)]
x = sys.stdin.read().split("\n")

print(x)
# ['0', '1', '2', '3', 'Hello']
```
#
```txt
1 2 3
4 5
```
```python
a, b, c, d, e = map(int, sys.stdin.read().split())

print(a + d, b * c)
# 5 6
```
#
```txt
1234
5678
ABCD
```
```python
x = [list(input()) for _ in range(n)]

print(x)
# [['1', '2', '3', '4'], ['5', '6', '7', '8'], ['A', 'B', 'C', 'D']]
```
#
```txt
0 A B
1 C
2 D 3
E 4
```
```python
x = [input().split() for _ in range(n)]
x = [sys.stdin.readline().split() for _ in range(n)]

print(x)
# [['0', 'A', 'B'], ['1', 'C'], ['2', 'D', '3'], ['E', '4']]
```

#
**Input to Dict - Multiple Lines, Multiple Inputs**<br>
```txt
A 10
B 20
C 30
```
```python
x = dict(input().split() for _ in range(n))
for key, value in x.items(): x[key] = int(value)

print(x)
# {'A': 10, 'B': 20, 'C': 30}
```
#
```txt
A
B
C
1
2
3
```
```python
z = {}
x = [input() for _ in range(n)]
y = [int(input()) for _ in range(n)]
# for i, key in enumerate(x): z[key] = y[i]
A = dict(zip(x, y))

B = dict(zip([input() for _ in range(n)], [int(input()) for _ in range(n)]))

print(A)
# {'A': 1, 'B': 2, 'C': 3}

print(B)
# {'A': 1, 'B': 2, 'C': 3}
```
