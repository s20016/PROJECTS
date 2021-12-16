import sys
import webbrowser

import requests as req
# from mal import Anime, AnimeSearch

# sys.stdin = open("/home/s20016/PROJECTS/PG/Python/Codes/input.txt", "r")
# sys.stdout = open("/home/s20016/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

x = []
url = "https://raw.githubusercontent.com/s20016/Animate/master/public/data/anime_list.json"

data = req.get(url).json()['anime']
for i in data:
    x.append(i['mal_id'])

print(x)

# animeList = list(input("Enter Anime: ").split(","))

# for entry in animeList:
#     search = AnimeSearch(entry.lstrip())

#     anime = Anime(malID := search.results[0].mal_id)
#     aniEN = anime.title_english
#     aniJA = anime.title_japanese
#     aniTP = anime.type
#     aniUR = anime.url

#     print(f'\n{{\n  "mal_id": {malID}')
#     print(f'  "en_title": "{aniEN}"')
#     print(f'  "ja_title": "{aniJA}"')
#     print(f'  "subtitle": ""')
#     print(f'  "type": "{aniTP}"')
#     print(f'  "count": \n}}')
#     print(f"\nCheck: {aniUR}")

#     animeURL = input("\nOpen URL in browser? (Y/N): ")
#     if animeURL.lower() in ["y", "yes"]:
#         webbrowser.open_new_tab(aniUR)
