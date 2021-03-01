import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

from mal import Anime, AnimeSearch, Manga, MangaSearch

import time

# mainList = list(sys.stdin.read().split("\n"))

for i in l4:
    manga = Manga(int(i)).type
    print(manga)
    time.sleep(1)

# anime = Anime(36793)
# print(anime.title_japanese)

# for i in l3:
#     search = MangaSearch(i)
#     print(search.results[0].mal_id)
#     time.sleep(1)