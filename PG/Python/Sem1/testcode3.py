import sys
sys.stdin = open("/home/s20016/Documents/PROJECTS/PG/Python/Sem1/input.txt", "r")
sys.stdout = open("/home/s20016/Documents/PROJECTS/PG/Python/Sem1/output.txt", "w")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:

import sys
l = []

x = sys.stdin.read().split("\n")
for i in x:
    l.append(f"<li>{i}</li>\n")

print(*l)