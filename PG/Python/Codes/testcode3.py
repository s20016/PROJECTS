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
    if i[-4:] == " (M)":
        newI = i.replace("(M)", "").strip()
        if i[:4] == "(2) ":
            newI2 = newI.replace("(2)", "").strip()
            movieList.append(newI2)
            finalMainList.append(f'<li class="M">{newI2}<span class="R">2</span></li>')
            continue
        finalMainList.append(f'<li class="M">{newI}</li>')
        movieList.append(newI)
    elif i[:4] == "(2) ":
        newI3 = i.replace("(2)", "").strip()
        rewatchList.append(i[4:])
        finalMainList.append(f'<li>{newI3}<span class="R">2</span></li>')
    else:
        finalMainList.append(f"<li>{i}</li>")


# print(mainList)
# print(len(mainListSort))

# mainListSort.sort()
# print("\n".join(i for i in finalMainList))

# for i in mainListSort:
#     if i in movieList:
#         finalMainList.append(f"<dt>{i}</dt>")
#     else: 
#         finalMainList.append(f"<dd>{i}</dd>")

# print(len(rewatchList))     # 12 Rewatch
# print(len(movieList))       # 27 Movies
# print(len(finalMainList))   # 203 Anime

# print(rewatchList)    # 12 Rewatch
# print(movieList)      # 27 Movies
# print(finalMainList)  # 203 Anime

print("\n".join(i for i in finalMainList))
# print("\n".join(f"<li>{i}</li>" for i in finalMainList))