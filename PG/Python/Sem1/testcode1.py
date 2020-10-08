import sys
sys.stdin = open("Python/Sem1/input.txt", "r")
sys.stdout = open("Python/Sem1/output.txt", "w")
#! TEST CODE 1
# TODO ==============================================================
# TODO START CODE HERE:

x, y = list(map(int, input().split()))
n = '{:0{}}'.format(min(x, y), len(str(max(x, y))))

a = [str(max(x, y)), n]
m = 1
l = []
l2 = []

for n in range(len(str(max(x, y)))):
    l.append((int(a[0][-m]) + int(a[1][-m])))
    m += 1
l.reverse()

for n in l:
    l2.append(str(n)[-1])

print("".join(l2))
