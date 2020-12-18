import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

list = [*range(2, int(input()) + 1)]

for x in [2, 3, 4, 5, 7]:
    for y in list:
        if x == y:
            continue
        elif y % x == 0:
            list.remove(y)

print(list)
