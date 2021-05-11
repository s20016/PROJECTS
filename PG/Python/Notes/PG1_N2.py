import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")
# =========================================================================

# AOJ

#* AOJ ITP1_1_D - Watch
"""
sec = int(input())
hr = int(sec/3600)
mi = int((sec%3600)/60)
sd = int((sec%3600)%60)

print(f"{hr}:{mi}:{sd}")
"""

#* AOJ ITP1_2_A - Small, Large, or Equal
"""
a, b = map(int, input().split())
if a == b:
    print("a == b")
elif a > b:
    print("a > b")
else:
    print("a < b")
"""

#* AOJ ITP1_3_B - Print Test Cases
"""
case_num = 1
while True:
    x = int(input())
    if x == 0:
        break
    else:
        print("Case {}: {}".format(case_num, x))
        case_num += 1
"""

#* AOJ ITP1_3_C - Swapping Two Numbers
"""
while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    else:
        print(f"{min(a, b)} {max(a, b)}")
"""

#* AOJ ITP1_3_D - How Many Divisors?
"""
a, b, c = map(int, input().split())
count = 0
for x in range(a, b + 1):
    if c % x == 0:
      count += 1
print(count)
"""

#* AOJ ITP1_4_A - A/B Problem
"""
a, b = map(int, input().split())
print("{} {} {:.10f}".format(int(a/b), a%b, a/b))
"""

#! PB1 06/25/2020 ===================================================
#* AOJ ITP1_4_B - Circle
"""
import math
r = float(input())
A = math.pi * (r**2) 
C = 2 * math.pi * r
print("{:.6f} {:.6f}".format(A, C))
"""

#* AOJ ITP1_4_C - Simple Calculator  
"""
while True:
  a, op, b = map(str, input().split())
  a, b = int(a), int(b)
  if op == "?": break
  if op == "+": print(int(a + b))
  if op == "-": print(int(a - b))
  if op == "*": print(int(a * b))
  if op == "/": print(int(a / b))
  """

#* AOJ ITP1_4_D - Min, Max and Sum
"""
n = int(input())
x = list(map(int, input().split()))
print("{} {} {}".format(min(x), max(x), sum(x)))
"""

#* AOJ ITP1_5_A - Print a Rectangle
"""
while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0: break
    for i in range(0, a):
        print("#" * b)
    print()
"""

#* AOJ ITP1_5_B - Print a Frame
"""
while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0: break
    for i in range(0, a + 1):
        pt = int(b - 2)
        if i == 0:
            print("#"*b)
        if 0 < i < a - 1:
            print("#" + "."*pt + "#")
        if i == a:
            print("#"*b)
    print()
"""

#! PB1 06/26/2020 ===================================================
#* AOJ ITP1_5_C - Print a Chessboard
"""
while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break 
    for y in range(0, a):
        for x in range(0, b):
            if (y + x)%2 == 0:
                print("#", end="")
            else:
                print(".", end="")
        print()
    print()
"""

#* AOJ ITP1_5_D - Structured Programming
"""
a = int(input())
for i in range(1, a + 1):
    if i % 3 == 0 or str(i).find("3") != -1:
        print(" {}".format(i), end="")
print()
"""

#* AOJ ITP1_6_A - Reversing Numbers
"""
n = input()
x = list(map(int, input().split()))
x.reverse()

print(" ".join(map(str, x)))
"""

#* AOJ ITP1_6_B - Finding Missing Cards
"""
n = int(input())
rc = list(input() for i in range(n))
for s in ["S","H","C","D"]:
    for num in range(1, 14):
        allc = "{} {}".format(s, str(num))
        if allc not in rc: print(allc)
"""
#! NOT YET SOLVED!
#* AOJ ITP1_6_C - Official House
"""
build_num = 0
while True:
  if build_num == 4: break
  for i in range(3):
      print(" 0" * 10)
  print("#" * 20)
  build_num += 1
"""

#* AOJ ITP1_8_B - Sum of Numbers 
"""
while True:
    n = input()
    x = list(int(i) for i in str(n))
    s = sum(x)
    if s == 0: break
    print(s)
"""

#* AOJ ITP1_8_C - Counting Characters
"""
import sys
s = sys.stdin.read().lower()
for c in map(chr, range(97,123)): print(f"{c} : {s.count(c)}")
"""

#! PB1 06/27/2020 ===================================================
#* Multiplication Table: Practice Code
"""
def multiply(x, y):
    return x * y
for i in range(1, 10):
    for num in range(1, 10):
        print(i * num, end="")
        if num < 9:
            print(", ", end="")
    print()
"""

#! PB1 06/29/2020 ===================================================
#* AOJ ITP1_7_A - Grading
"""
while True:
    m, f, r = map(int, input().split())

    if sum((m, f, r)) == -3: break
    if m == -1 or f == -1: print("F")
    elif m + f >= 80: print("A") 
    elif m + f >= 65: print("B") 
    elif m + f >= 50: print("C") 
    elif m + f >= 30: 
        if r >= 50: print("C")
        else: print("D")
    else: print("F")
"""

#* AOJ ITP1_9_A - Finding a Word
"""
import sys
w = input()
p = sys.stdin
count = 0

for line in p:
    x = line.lower().split().count(w)
    count += x
print(count)
"""

#* AOJ ITP1_8_A - Toggling Cases
"""
x = str(input())
print(x.swapcase())
"""

#* AOJ ITP1_10_A - Distance
"""
import math
x1, y1, x2, y2 = map(float, input().split())

d = math.sqrt((x2 - x1)**2 + (y2 - y1)**2)  
print("{:.8f}".format(d))
"""

#* AOJ ITP1_10_B - Triangle
"""
import math
a, b, c = map(float, input().split())

A = ((a*b) * math.sin(math.radians(c)) * 0.5)
L = math.sqrt((a**2) + (b**2) - (2*a*b) * math.cos(math.radians(c))) + a + b
H = 2 * A / a

print("{:.8f}\n{:.8f}\n{:.8f}".format(A, L, H))
"""

#* AOJ ITP1_8_D - Ring
"""
x = input() * 2
w = input()

print("Yes" if w in x else "No")
"""