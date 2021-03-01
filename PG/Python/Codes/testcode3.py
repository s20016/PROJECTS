import sys, os

sys.stdin = open(f"{os.getcwd()}/input.txt", "r")
sys.stdout = open(f"{os.getcwd()}/output.txt", "w")

# TEST CODE 3
# =========================================================================

x = list(sys.stdin.read().split("\n"))

l = []

for i in x:
    if "type" in i:
        i.replace(",", ",\n")
        print('  "status": "FR",')
    else: print(i)

# print("\n".join(l))
