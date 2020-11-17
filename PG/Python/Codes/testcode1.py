import sys

sys.stdin = open("/home/s20016/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/s20016/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

list1 = [-3, -2, -1, 0, 1, 2, 3]
list2 = []
for i in list1:
    if i < 0:
        list2.append("負")
    elif i == 0:
        list2.append("零")
    else:
        list2.append("正")

print(list2)

list1.reverse()
print(list1)
