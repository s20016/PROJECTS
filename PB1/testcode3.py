import sys
#! SL PATH:
#sys.stdout = open("/home/s20016/pythonlesson/CP/output.txt", "w")
#sys.stdin = open("/home/s20016/pythonlesson/CP/input.txt", "r")

#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO===============================================================
# TODO START CODE HERE:


import sys
s = sys.stdin.read().lower()
for c in map(chr, range(97,123)): print(f"{c} : {s.count(c)}")

