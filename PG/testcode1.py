import sys
#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO ==============================================================
# TODO START CODE HERE:

for i in range(50):
	print("{:>8} {}".format(bin(i), i))