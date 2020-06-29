import sys
#! SL PATH:
#sys.stdout = open("/home/s20016/pythonlesson/CP/output.txt", "w")
#sys.stdin = open("/home/s20016/pythonlesson/CP/input.txt", "r")

#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO===============================================================
# TODO START CODE HERE:

x = list(str(input()))
w = str(input())
u = ""

for c in w:
    if c in x:
        u += c
        del c 
    else: print("No")
if u == w:
    print("Yes")
