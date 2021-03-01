import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

x = list(sys.stdin.read().split("\n"))


count = 0
for i in x:
    if "mal_id" in i:
        count += 1

print(count)
