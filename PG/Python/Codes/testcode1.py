import sys

sys.stdin = open("/home/s20016/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/s20016/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

x = sys.stdin.read().split("\n")
for i in x:
    print(f"<li>{i}</li>")