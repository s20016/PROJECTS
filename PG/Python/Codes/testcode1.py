import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

# int [] a = {1, 3, 4, 7, 9, 11};
# int idx = 2;
# int x = 99;

a = [1, 3, 4, 7, 9, 11]
a[2] = 99
print(a)
