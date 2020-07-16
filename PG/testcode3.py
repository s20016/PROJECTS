import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:



"""
import math as m, sys 
x = list(map(int, [i for i in sys.stdin.read().split("\n")]))
print((m.floor((x[0] / x[1]) * x[2]) - x[0]))
"""


x = float(input())
y = float(input())
z = float(input())
print(round(((x / y) * z) - x))
  