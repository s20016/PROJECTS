import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

x = list(sys.stdin.read().split("\n"))

for i in x:
    comma = i.count(",")
    if comma > 3:
        print(f"{i}: {comma}")

print(x)
