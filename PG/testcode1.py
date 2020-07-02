import sys
#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO ==============================================================
# TODO START CODE HERE:

from random import choice, sample
x = [ chr(c) for c in range(ord("a"), ord("z") + 1)]
print(sample(x, 5))
print(choice(x))