import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

x = list(sys.stdin.read().split("\n"))
main = [x[0]]
main2 = []

for i in range(len(x)):
    if i > 0:
        main.append(x[i].split(" ")[1])

component = [
    "this.GetAnimeList()",
    "this.GetAnimeIMG()",
    "GetAnimeList",
    "GetAnimeIMG",
    "AnimeHeader",
    "AnimeDisplay",
    "AnimeListMode",
    "AnimeIMGMode",
    "AnimeFooter"
]

for num in main:
    main2.append(f'{num} - {component[int(num) - 1]}')

print("\n".join(main2))


