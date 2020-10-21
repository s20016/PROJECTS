import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")
#! TEST CODE 2
# TODO ==============================================================
# TODO START CODE HERE:

x, y = list(map(str, input().split()))

date = list(x.split("/"))
time = list(y.split(":"))

ntime = int(time[0])
ndate = int(date[1])

for i in range(10):
    if ntime >= 24:
        ntime -= 24
        ndate += 1

print(f"{date[0]}/{ndate} {str(ntime).zfill(2)}:{time[1]}")