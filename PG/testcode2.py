import sys
#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO ==============================================================
# TODO START CODE HERE:


x = 121.13241985145145
print("{:.6f}".format(x))
print("%.6f" % x)