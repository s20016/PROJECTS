import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

# n = int(input())
# x = [input() for _ in range(n)]
# l = []
# for i in x:
#     if i not in l:
#         l.append(i)
#     else:
#         l.remove(i)
#         l.append(i)

# l.reverse()
# print("\n".join(l))

x = input()
l = [input() for _ in range(int(input()))]
w = []

for i in l:
    if x == i:
        w.append("first")
    elif str(int(x) + 1) == i or str(int(x) - 1) == i:
        w.append("adjacent")
    elif x[-4:] == i[-4:]:
        w.append("second")
    elif x[-3:] == i[-3:]:
        w.append("third")
    else:
        w.append("blank")

print("\n".join(i for i in w))
