from io import SEEK_END
import sys
from typing import final

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

mainList = list(sys.stdin.read().split("\n"))
rewatchList = []
movieList = []
mainListSort = []
finalMainList = []

for i in mainList:
    if i[:4] == "(2) ":
        rewatchList.append(i[4:])
        mainListSort.append(i[4:])
    else:
        mainListSort.append(i)

for i in mainListSort:
    if i[-4:] == " (M)":
        movieList.append(i[:-4])

# print(mainList)
# print(len(mainListSort))

mainListSort.sort()
# print("\n".join(i for i in mainListSort))

for i in mainListSort:
    if i in rewatchList:
        finalMainList.append(f"(2) {i}")
    else: 
        finalMainList.append(i)

print("\n".join(i for i in finalMainList))
# print("\n".join(f"<li>{i}</li>" for i in finalMainList))

# print(len(rewatchList))     # 11 Rewatch
# print(len(movieList))       # 27 Movies
# print(len(finalMainList))   # 203 Anime