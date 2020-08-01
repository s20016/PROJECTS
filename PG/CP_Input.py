### List of ways to READ input()
### Last Update: August 1, 2020

###TODO Note:
# MODULE: import sys when "sys.stdin" in use
# n == number of lines

#TODO Single line input() ===========================================================
#! Single line input() / 1 (str, int, float)
x = input()         # use for str (hi, hello)
x = int(input())    # use for int (Ex. 123, -123)
x = float(input())  # Use for float (Ex. 8.10, -1.09)

#! Single line input() / 2 or more (str, int, float) / Separated by SPACE or CHAR
x, y, z = map(str, input().split())       # Change from "str" to "int" or "float"

x, y, z = sys.stdin.readline().split()

# 0 1 Hello
# print(x, z) >>> 0 Hello

x = input().split()
                                     
x = sys.stdin.read().split()

# 08 10 Hello 99.9
# print(x) >>> ['08', '10', 'Hello', '99.9']

# Use for int or float
x = list(map(float, input().split()))

x = list(map(float, sys.stdin.read().split()))

# print(x) >>> [8.0, 10.0, 52.0, 99.9]

#! Single line input() / 1 (str, int, float) / GOAL: Split each CHAR
x = list(input())

# 0123Hello
# print(x) >>> ['0', '1', '2', '3', 'H', 'e', 'l', 'l', 'o']


#TODO Multilple line input() ========================================================
#! Multiple lines input() / 1 (str, int, float)
x = [input() for _ in range(n)]         
# can wrap input() with int() or float()

x = sys.stdin.read().split("\n")

# 0
# 1
# 2
# 3
# Hello

# print(x) >>> ['0', '1', '2', '3', 'Hello']

#! Multiple lines input() / 2 or more (str, int, float) / Separated by SPACE or CHAR
a, b, c, d, e = map(int, sys.stdin.read().split())

# 1 2 3
# 4 5

# print(a + d, b * c) >>> 5 6

#! Multiple lines input() / 1 (str, int, float) / GOAL: Split each CHAR
x = [list(input()) for _ in range(n)]

# 1234
# 5678
# ABCD

# print(x) >>> [['1', '2', '3', '4'], ['5', '6', '7', '8'], ['A', 'B', 'C', 'D']]

#! Multiple lines input() / 2 or more (str, int, float) / Separated by SPACE or CHAR
x = [input().split() for _ in range(n)]

x = [sys.stdin.readline().split() for _ in range(n)]

# 0 A B
# 1 C
# 2 D 3
# E 4 

# print(x) >>> [['0', 'A', 'B'], ['1', 'C'], ['2', 'D', '3'], ['E', '4']]


#TODO Input() to Dictionary =========================================================
#! Multiple lines input() / 2 or more (str, int, float) / Separated by SPACE or CHAR
#! Goal: Assign each KEY with int(VAL)

x = dict(input().split() for _ in range(n))
for key, value in x.items(): x[key] = int(value)

# A 10
# B 20
# C 30

# print(x) >>> {'A': 10, 'B': 20, 'C': 30}


#! Multiple lines input() / 1 (str, int, float) / GOAL: Assign each KEY with int(VAL)
z = {}
x = [input() for _ in range(n)]
y = [int(input()) for _ in range(n)]
for i, key in enumerate(x): z[key] = y[i]

# A
# B
# C
# 1
# 2
# 3

# print(z) >>> {'A': 1, 'B': 2, 'C': 3}