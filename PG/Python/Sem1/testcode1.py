import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")
#! TEST CODE 1
# TODO ==============================================================
# TODO START CODE HERE:

x, y = list(map(str, input().split()))

date = list(x.split("/"))
time = list(y.split(":"))

A = int(time[0]) // 24
B = int(time[0]) % 24
print(A, B)
h = str(abs(A - B - 1)).zfill(2)

print(f"{date[0]}/{int(date[1]) + A}", f"{h}:{time[1]}")