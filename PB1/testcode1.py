import sys
#! SL PATH:
#sys.stdout = open("/home/s20016/pythonlesson/CP/output.txt", "w")
#sys.stdin = open("/home/s20016/pythonlesson/CP/input.txt", "r")

#! PL PATH:
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
# TODO===============================================================
# TODO START CODE HERE:

w = str(input())
n = int(input())
x = sys.stdin

for cmd in x:
    j = list(cmd.split())
    if j[0] == "replace":
        a, b, c, d = map(str, input().split())
        print(a, b, c, d)
    elif j[0] == "reverse":
        a, b, c = map(str, input())


print(w)