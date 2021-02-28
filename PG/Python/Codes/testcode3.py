import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

mal_id = list(sys.stdin.read().split("\n"))

mid = []

for anime in mal_id:
    mid.append(anime.split(" ")[1])

print("\n".join(mid))
# print(mid)