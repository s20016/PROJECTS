import sys

# sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
# sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

n = int(input())
print(round(180 * (n - 2) / n))

# a, b = map(int, input().split())
# print(((a * 1000) / b) * b)
# print("yes" if ((a * 1000) / b) * b >= 10000 else "no")

# x = input().split()
# l = {i: x.count(i) for i in x}
# for k, v in l.items():
#     print(k, v)

# import functools
# x = list(map(int, input().split()))
# total = functools.reduce(lambda a, b : min(a, b), x)
# print(total)

# n = int(input())
# x = [input() for _ in range(n)]
# strike = 0; ball = 0

# for i in x:
#     if i == "ball":
#         ball += 1
#         print("ball!" if ball < 4 else "fourball!")
#     elif i == "strike":
#         strike += 1
#         print("strike!" if strike < 3 else "out!")
