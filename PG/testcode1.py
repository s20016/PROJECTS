import sys
#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO ==============================================================
# TODO START CODE HERE:

import random

x = [ chr(c) for c in range(ord("a"), ord("z") + 1)]

while True:
    ch = random.choice(x)
    val = input("Enter val: ")
    ans = "OK" if ch == val else "NG"
    print(ans, ch)
