from io import SEEK_END
import sys
from typing import final

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

# movie - dt
# normal - dd

mainList = list(sys.stdin.read().split("\n"))
rewatchList = []
movieList = []
mainListSort = []
finalMainList = []

# for i in mainList:
#     if i[:4] == "(2) ":
#         rewatchList.append(i[4:])
#         mainListSort.append(i[4:])
#     else:
#         mainListSort.append(i)

# for i in mainListSort:
#     if i[-4:] == " (M)":
#         movieList.append(i[:-4])
#         mainListSort.append(i[:-4])

for i in mainList:
    if "(M)" in i:
        newI = i.replace("(M)", "").strip()
        finalMainList.append(f'<li class="M">{newI}</li>')
        movieList.append(newI)
    else:
        finalMainList.append(f"<li>{i}</li>")


# print(mainList)
# print(len(mainListSort))

# mainListSort.sort()
print("\n".join(i for i in finalMainList))

# for i in mainListSort:
#     if i in movieList:
#         finalMainList.append(f"<dt>{i}</dt>")
#     else: 
#         finalMainList.append(f"<dd>{i}</dd>")

# print("\n".join(i for i in finalMainList))
# print("\n".join(f"<li>{i}</li>" for i in finalMainList))

# print(len(rewatchList))     # 12 Rewatch
# print(len(movieList))       # 27 Movies
# print(len(finalMainList))   # 203 Anime