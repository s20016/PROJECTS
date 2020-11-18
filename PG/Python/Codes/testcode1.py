import sys

sys.stdin = open("/home/s20016/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/s20016/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

x = [int(input()) for _ in range(6)]

list2 = []

for i in x:
    if i < 0:
        list2.append("負")
    elif i == 0:
        list2.append("零")
    else:
        list2.append("正")

print(list2)
# list1.reverse()
