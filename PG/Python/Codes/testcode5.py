import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

from mal import Anime, AnimeSearch
import time

# mainList = list(sys.stdin.read().split("\n"))

# for i in mainList:
#     anime = Anime(int(i))
#     print(anime.title_japanese)
#     time.sleep(1)

# anime = Anime(36793)
# print(anime.title_japanese)

search = AnimeSearch("Ane Log")
print(search.results[0].mal_id)