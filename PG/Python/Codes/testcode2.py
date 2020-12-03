import sys

sys.stdin = open("/home/s20016/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/s20016/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

x = [2, 4, 5, 8, 9, 1, 0, 3, -3]
x.sort(reverse = True)

print(x)