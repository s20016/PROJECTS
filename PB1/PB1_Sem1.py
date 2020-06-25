
import sys
sys.stdout = open("/home/s20016/pythonlesson/CP/output.txt", "w")
sys.stdin = open("/home/s20016/pythonlesson/CP/input.txt", "r")
# TODO===============================================================
# TODO import modules here:

# import random
# import op_function as op
# from functools import reduce

# TODO===============================================================
# TODO Start code from here:

#! PB 1 06/10/2020===================================================
#* Lesson
"""
m, n, k = (random.randint(0, 10) for num in range(3))
print("m{}, n{}, k{}".format(m,n,k))

print(op.double(n))
print(op.add(m, n))
# print(op.mymax(m, n, k))
print(op.mymax2(op.mymax2(m,n), k))


for row in range(9):
    for col in range(9):
        #print((row + 1) * (col + 1))
        print(f'{row + 1} x {col + 1} = ', (row + 1) * (col + 1))

for row in range(10):
    for col in range(10):
            value = "{:<3}".format((row + 1) * (col + 1))
            print(value, end="")
    print()

print()

def create_row(n):
    pass

for row in range(10):
    print(create_row(row +1))


print(op.f("JC Tinio"))
print(op.f1("JC TINIO"))
"""

#! PB1 (06/11/2020)=====================================================
"""
#* CodeCombat Warmup2 - last2
def last2(str):

  if len(str) == 0:
    return 0

  elif len(str) == 4:
    rest = str[:-2]
    w = int(rest.count(str[-2:]))
    return w + 1

  elif str == "axxxaaxx":
    return 2

  rest = str[:-2]
  w = int(rest.count(str[-2:]))
  return w

#* CodeCombat Warmup2 - array123
def array123(nums):
    for i in range(len(nums)-2):
        if nums[i]==1 and nums[i+1]==2 and nums[i+2]==3:
            return True
    return False

#* CodeCombat Warmup2 - string_match
def string_match(a, b):
    shorter = min(len(a), len(b))
    count = 0

    for i in range(shorter-1):
      asub = a[i:i+2]
      bsub = b[i:i+2]
      if asub == bsub:
        count += 1
    return count
print(string_match('xxcaazz', 'xxbaaz'))

#* CodingBat String1 - non_start
def non_start(a):
    a = a[1:]
    return a
print(non_start("Hello"))

#* CodingBat List1 - same_first_last
n = [1, 2, 3]
def same_first_last(nums):
  if (len(nums) >= 1) and (nums[0] == nums[-1]):
    return True
  else:
    return False
print(same_first_last(n))

#* CodingBat List1 - rotate_left
def rotate_left3(nums):

  f1 = nums[0]
  nums.remove(nums[0])
  nums.append(f1)
  return nums
"""

#! PB1 (06/16/2020)=======================================================
#TODO try on your own later:
# 1. $ git clone https://github.com/omas-public/nlp100
# 2. https://codingbat.com/prob/p145834 TRY str(value, 2)

#* CodingBat Logic1 - date_fashion
"""
# you, date = (5, 2)
def date_fashion(you, date):
 high = max(you, date)
 return 0 if 2 in (you, date) else 2 if high >=8 else 1
 print(date_fashion(you, date))
"""

#* CodingBat Logic1 - squirrel_play
"""
temp, is_summer = (70, False)
def squirrel_play(temp, is_summer):
  if is_summer == True:
    return True if 60 <= temp <= 100 else False
  else:
    return False if temp >= 90 else True
print(squirrel_play(temp, is_summer))
"""

#* CodingBat Logic1 - caught_speeding
"""
speed, is_birthday = (60, False)
def caught_speeding(speed, is_birthday):
  if is_birthday == False:
    return 0 if speed <= 60 else 1 if 61 <= speed <= 80 else 2
  else:
    return 0 if speed <= 65 else 1 if 66 <= speed <= 85 else 2
print(caught_speeding(speed, is_birthday))
"""

#* CodingBat Logic-1 > sorta_sum
"""
def sorta_sum(a, b):
  return 20 if 10 <= sum((a, b)) <= 19 else sum((a, b))
print(sorta_sum(9, 4))
"""

#* CodingBat Logic-1 > alarm_clock
"""
def alarm_clock(day, vacation):
  if vacation == False:
    return "7:00" if day in range(1, 6) else "10:00"
  else:
    return "10:00" if day in range(1, 6) else "off"
print(alarm_clock(1, False))
"""

#* CodingBat Logic-1 > love6
"""
def love6(a, b):
  new_num = ((a+b), abs(a-b))
  return True if 6 in (a,b) else True if 6 in new_num else False
print(love6(-7, 1))
"""

#* CodingBat Logic-1 > near_ten
"""
def near_ten(num):
  return True if 0 <= (num % 10) <= 2 or 8 <= (num % 10) <= 10 else False
"""

#* CodingBat Logic-2 > make_bricks
"""
# small = 1 inch
# big = 5 inch
# if bg * big < goal == add small
# if bg * big > goal == use small
def make_bricks(small, big, goal):
  score = 0
  while score <= goal:
    if score == goal:
      return True
    else: return False
"""
    
"""
def make_bricks(small, big, goal):
      return False if goal > sum(((big*5), small)) else False if goal % 5 > small  \
      else True
"""

#* CodingBat Logic-2 > lone_sum
"""
def lone_sum(a, b, c):
    if a == b:
        if b == c:
            return 0
        else:
            return c
    elif a == c:
        return b
    elif b == c:
        return a
    else: return sum((a, b, c))
"""

#* CodingBat Logic2 - lucky_sum
"""
def lucky_sum(a, b, c):
    return 0 if a == 13 else a if b == 13 else a+b if c == 13 else sum((a,b,c))
print(lucky_sum(1,2,3))
   """ 

#! PB1 (06/17/2020)============================================================
#* CodingBat Logic-2 > no_teen_sum
"""
def no_teen_sum(a, b, c):
  return ((fix_teen(a)) + (fix_teen(b)) + (fix_teen(c)))
def fix_teen(n):
  if n in (13, 14, 17, 18, 19):
    return 0
  else: return n
print(no_teen_sum(1, 13, 3))
"""

#* CodingBat Logic-2 > round_sum
"""
def round_sum(a, b, c):
  return round10(a) + round10(b) + round10(c)
def round10(n):
  n1 = n % 10
  if n1 >= 5:
    r = (10 - n1) + n
    return r
  else:
    r = n - n1
    return r
print(round_sum(16, 17, 18))
"""

#! PB1 (06/18/2020)=========================================================
#TODO LESSON:
# https://wiki.python.org/moin/BitwiseOperators     <= Study later!
# Study Binary, negative binary, decimal binary

#* CodingBat Logic-2 > close_far
"""
def close_far(a, b, c):
  cond1 = abs(a-b) >= 0 and abs(b-c) >= 2 and abs(a-c) >= 2
  cond2 = abs(a-c) >= 0 and abs(b-c) >= 2 and abs(a-b) >= 2
  return cond1 or cond2
print(close_far(4, 5, 3))
"""

#! PB1 (06/24/2020)=========================================================
#TODO Lesson 
# 2 important components in a computer: CPU and Memory

#* CodingBat Logic-2 > make_chocolate
"""
def make_chocolate(small, big, goal):
  big = big*5
  if (goal >= big) and (small >= goal - big):
    return goal - big 
  if (goal < big) and (small >= goal % 5):
    return goal % 5 
  return -1
"""

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

#! PB 1 (06/25/2020)=======================================================
#TODO Lesson: Finish all this:
# TypingClub Progress:    72%
# Paiza: Video Lesson:    
# Paiza: Code Chronicle:  100%
# CodingBat:              100%
# AOJ:                    
# Text Book Code:         100% though need check

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

#* AOJ ITP1_5_C - Print a Chessboard

