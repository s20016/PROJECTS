import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 2
# TODO ==============================================================
# TODO START CODE HERE:

import math as m, sys
lines = [line.strip() for line in sys.stdin.readlines()]
x = list(map(int, [i for i in lines]))
print((m.floor((x[0] / x[1]) * x[2]) - x[0]))
