import sys
#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO ==============================================================
# TODO START CODE HERE:


l = [1, 1, 2, 3, 5, 8, 13]
x = sum([e for e in l if e % 2 != 0])
print(x)
