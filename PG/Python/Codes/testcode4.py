import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

import tmp_animate as animate

mainList = list(sys.stdin.read().split("],\n"))

mainList2 = []
mainList3 = []

finalMainList = []

title = []
subtitle = []
a_type = []
count = []

for anime in mainList:
    title.append(anime.replace("[", "").split(", ")[0])
    subtitle.append(anime.replace("[", "").split(", ")[1][3:-1])
    a_type.append(anime.replace("[", "").split(", ")[2][1])
    count.append(anime.replace("[", "").split(", ")[2][2])

for i in range(len(mainList)):
    mainList3.append(
        f'{{ "mal_id": "{animate.mid[i]}",\n  "en_title": {title[i]},\n  "ja_title": "{animate.ja_title[i]}",\n  "subtitle": "{subtitle[i]}",\n  "type": "{"Movie" if a_type[i] == "M" else "Anime"}",\n  "count" : "{count[i]}"\n}},')

# print(len(mainList3))
print("\n".join(mainList3))

# print("]\n".join(mainList))
# print("\n".join(subtitle))
