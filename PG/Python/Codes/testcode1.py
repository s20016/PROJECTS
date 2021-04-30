import sys
import webbrowser

from mal import Anime, AnimeSearch

# sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
# sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================


animeList = list(input("Enter Anime: ").split(","))

for entry in animeList:
    search = AnimeSearch(entry.lstrip())

    anime = Anime(malID := search.results[0].mal_id)
    aniEN = anime.title_english
    aniJA = anime.title_japanese
    aniTP = anime.type
    aniUR = anime.url

    print(f'\n{{\n  "mal_id": {malID}')
    print(f'  "en_title": "{aniEN}"')
    print(f'  "ja_title": "{aniJA}"')
    print(f'  "subtitle": ""')
    print(f'  "type": "{aniTP}"')
    print(f'  "count": \n}}')
    print(f"\nCheck: {aniUR}")

    animeURL = input("\nOpen URL in browser? (Y/N): ")
    if animeURL.lower() in ["y", "yes"]:
        webbrowser.open_new_tab(aniUR)
