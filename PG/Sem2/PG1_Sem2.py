import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO ==============================================================
# TODO IMPORT MODULE HERE:


# TODO ==============================================================
# TODO START CODE HERE:

#! P1 07/01/2020 ====================================================
#* Lesson Notes:
"""
Python 3 Skill-up Text Book
Chapter 2, Chapter 3 = Review form Sem 1, study
Chapter 4, Chpater 5 = Important!
Chapter 6, Chapter 7 = Less important
Chapter 8            = Important!

#TODO Study this!
======================
2 Types:
Interpreter:
    - Python 3
    - Speed: Interpreter < Compiler
    - By Guido Van Rossum
Compiler:
    - C
    - Speed: Interpreter > Compiler
    - interpreter reads per line while compiler reads whole code.
======================

Useful Functions:
    1.  pow(x, y, z) 
        x	A number, the base
        y	A number, the exponent
        z	Optional. A number, the modulus

    2.  import mathw
        math.gcd(341, 253)
        >>> 1

        same as;
        a, b = 341, 253
        a, b = b, a%b
        # repeat until 0

Searh Later:
    1. When to use Camelcase?
    2. What is "literal" in Python
"""

#! P1 07/02/2020 ====================================================
#* Lesson Notes:
"""
-  Objects and Numbers
-  Bit (short for Binary digit): 0 or 1
    01011 = 5 Bit
-  Naming Convention:
    
    Do not use ["l", "O", "I"] as a single char variable name

    Modules         - short, all-lowercase
    Python packages - short, all-lowercase
    Class names     - CapWords
    Variable names  - CapWords, preferring short names

Useful Functions:

    1.  120//55 >>> 2
        120 % 5 >>> 10
        =
        divmod(120, 55)
        >>> (2, 10)
        a, b = divmod(120, 55)
        print(a, b)
        >>> 2 10

    2.  x = 2.679
        round(x, 2)                 >>> 2.68
        print("{:.2f}".format(x))   >>> 2.68
    
    3.  1e10   >>> 10000000000.0
        8.10e3 >>> 8100.0
    
    4.  import sys
        sys.float_info.max (largest value)
        sys.float_info.min (smallest value)

    5.  decimal.Decimal.from_float()
        =
        from decimal import Decimal
        Decimal.from_float()
        = 
        from decimal import Decimal as D
        D.from_float()

    6.  bin() - int to binary
        bin(7)  >>> '0b111'
        bin(10) >>> '0b1010'
        The prefix 0b represents that the result is a binary string.

    7.  hex() - int to hexdecimal

    8.  x = [10, 20]
        a, b = x
        print(a) >>> 10
        print(b) >>> 20

    9.  hex(ord("A")) >>> 0x41
        hex(ord("a")) >>> 0x61

    10. printing a~z
        [chr(c) for c in range(ord("a"), ord("z") + 1)]

    #TODO Study later:
    1. ASCII
    2. Binary and computer input
    3. chr and ord difference


import random
x = [ chr(c) for c in range(ord("a"), ord("z") + 1)]

print(random.choice(x))
>>> u
print(random.sample(x, 5))
>>> ['f', 'c', 'd', 'l', 'e']
"""

#! P1 07/07/2020 ====================================================
#* Lesson Notes:
"""
Useful Functions:
    1.  '{0}{1}{0}'.format('-', 0)
        >>> -0-

    2.  l = [0, 10, 8]
        l[1:1] = [16, 17]
        >>> l = [0, 16, 17, 10, 8]

        l[1:4] = []
        l = [0, 8]
    
    3.  Printing num with bin
        for i in range(50):
	    print("{:>8} {}".format(bin(i), i))

        limiting number of decimal places:
        x = 121.13241985145145

        M1: print("{:.6f}".format(x))
        M   2: print("%.6f" % x)

"""

#! P1 07/08/2020 ====================================================
#* Lesson Notes:
"""
    #* One line: If, else Function
    1.  a = 20
        M1: x = 'OK' if a >= 10 else 'NG'
        print(x)
        M2: x = {False: 'NG', True: 'OK'}[a >= 10]

    #* One line: For function    
    2.  l = [e * 2 for e in range(20)]
        print(l)

    #* Combination of For and If function
    3.  l = [str(i) for i in [0, 1, 2, 3] if i % 2 == 0 ]
        print("\n".join(l))

    4.  l = [1, 1, 2, 3, 5, 8, 13]
        x = sum([e for e in l if e % 2 != 0])
        print(x)

    #* Printing by twos
    5.  M1: x = [e for e in range(0, 20, 2) if e % 2 == 0]
        M2: y = list(range(0, 20, 2))
        print(x)
        print(y)

    #* Alternative for continue, skip 2
    6.  x = [x for x in range(5) if x != 2]
        print(x)

    #* Guessing alphabet game (run in Python IDLE)
    7.  M1:
        import random
        x = [ chr(c) for c in range(ord("a"), ord("z") + 1)]
        while True:
            ch = random.choice(x)
            val = input("Enter val: ")
            ans = "OK" if ch == val else "NG"
            print(ans)
            print(ch)

        M2:
        from random import choice
        x = [ chr(c) for c in range(ord("a"), ord("z") + 1)]
        for _ in iter(input, choice(x)):
            print("NG")
        print("OK")

        #TODO:
        Study iter
"""
#! PB1 07/09/2020 ===================================================
#* Counting prime numbers
"""
x = int(input())
y = int(input())
count = 0
for num in range(y, y + x):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            count += 1
print(count) 
"""

#! PB1 07/14/2020 ===================================================
#* Lesson Notes: Page 70
"""
    #* Useful Codes
    #* Identifying MAX and MIN (int per line)
    1.  import sys
        x = list(sys.stdin.read().split("\n"))
        for i in range(0, len(x)):
            x[i] = int(x[i])
        print(max(x))
        print(min(x))

    #* List >> range(num), str
    2.  lines = list(map(str, range(1, 11)))
        print(lines)
        with open("number.txt", "w") as f:
            f.write("\n".join(lines))

        with open("number.txt", "r") as f:
            print(sum(map(int, list(f))))

    #* Def to Lambda
    3.  def add2(a, b):
            return a + b
        print(add2(1, 2))

        add = lambda a, b : a + b
        print(add(1, 2))

    #* Converting str list to int list 1
    4.  x = input()
        y = sys.stdin.read().split(" ")
        for i in range(0, len(y)):
            y[i] = int(y[i])
        print(sum(y))
   
    5.  #* GCD
    M1: def gcd(a, b):
        a, b = max([a, b]), min([a, b])
        while b:
            a, b = b, a % b
        return a
    print(gcd(num2, num2))

    M2: def binary(n):
            buf = []
            while n:
                n, m = divmod(n, 2)
                buf.append(str(m))
                return "".join(reversed(buf))
        print(binary(num1, num2))

    #* No need to use "from math import *"
    M3: import math
        print(math.gcd(num1, num2))

    6. #* join and one line for fucntion
        print("".join([l.get(c, c) for c in x]))
"""
#! P1 07/15/2020 ====================================================
#* Lesson Notes:
"""
    1.  #* Fibonacci
    M1: def fib(n):
        a, b = 0, 1
        while a < n:
            print(a, end=" ")
            a, b = b, a + b
        print(fib(1000))

    M2: def fib2(n):
            a, b = 0, 1
            for _ in range(10):
                a, b = b, a + b
            return b
        print(fib2(10), end=" ")

    #* dict
    2.  l = {0 : "今日", 1 : "明日", -1: "昨日"}
        def day(n):
            return l[n]
        print(day(0))

    #* Converting str list to int list 1
    3.  x = list(map(int, input().split()))
"""