"""import sys
sys.stdin  = open("CP/input.txt", "r")
sys.stdout = open("CP/output.txt", "w")
"""
# Start code from here:

a, b = map(int, input().split())

#Countdown

"""for i in range(a, b, -1):
    print(i)
print("Hello, JC!")"""


# Odd or Even
"""if (a%2) == 0:
    print("a is even")
else:
    print("a is odd")"""

a_even = (a%2) == 0
b_even = (b%2) == 0

if a_even == True and sb_even == True:
    print("a b: Even")
elif a_even == True and b_even == False:
    print("a: Even")
else:
    print("b: Even")

    # use return
    #print("a b: Even")"""