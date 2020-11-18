import sys

sys.stdin = open("/home/s20016/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/s20016/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

# x = int(input())
# a = 0
# for i in range(x + 1):
#     a += i

# print(a)
x = int(input())
l = []
for i in range(1, x + 1):
    if x % i == 0 or x == 1:
        l.append(i)

print(l)