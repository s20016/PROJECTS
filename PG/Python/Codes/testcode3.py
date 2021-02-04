import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

# movie - dt
# normal - dd

mainList = list(sys.stdin.read().split("\n"))

mainList2 = []
rewatchList = []
movieList = []
mainListSort = []
finalMainList = []

for i in mainList:
    if '<li class="M">' in i:
        if '<span class="R">2</span>' in i:
            rewatchList.append(
                i.replace('<li class="M">', '"')
                .replace('<span class="R">2</span></li>', '", "", "M2"')
            )
        else: 
            movieList.append(
            i.replace('<li class="M">', '"')
            .replace('</li>', '", "", "M1"')
        )
    else:
        if '<span class="R">2</span>' in i:
            rewatchList.append(
                i.replace('<li>', '"')
                .replace('<span class="R">2</span></li>', '", "", "A2"')
            )
        else:
            mainList2.append(
                i.replace('<li>', '"')
                .replace('<span class="R">2</span></li>', '", "", "A1"')
                .replace('</li>', '", "", "A1"')
            )

for i in mainList2:
    mainListSort.append(i)
for i in rewatchList:
    mainListSort.append(i)
for i in movieList:
    mainListSort.append(i)

mainListSort.sort()
# print("\n".join(mainListSort))


for i in mainListSort:
    finalMainList.append('[' + i + '],')

print("\n".join(finalMainList))