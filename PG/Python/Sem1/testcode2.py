import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")
#! TEST CODE 2
# TODO ==============================================================
# TODO START CODE HERE:

import sys

x = list(sys.stdin.read().split("\n"))
l = []
for i in x:
    l.append(f"<li>{i}</li>\n")

print(*l)