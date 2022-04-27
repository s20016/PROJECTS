import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 3
# =========================================================================

from mal import Anime, AnimeSearch, Manga, MangaSearch
import webbrowser

url = []
animateOption = input(f"Animate list for Anime/Manga? (A/M): ")

if animateOption.lower() in ["a", "anime"]:
    animeList = list(input("Enter Anime: ").split(",")); print()

    for entry in animeList:
        search = AnimeSearch(entry.lstrip())

        anime = Anime(malID := search.results[0].mal_id)
        aniEN = anime.title_english
        aniJA = anime.title_japanese
        aniTP = anime.type
        url.append(aniUR := anime.url)

        print(f'{{\n  "mal_id": {malID},')
        print(f'  "en_title": "{aniEN}",')
        print(f'  "ja_title": "{aniJA}",')
        print(f'  "subtitle": "",')
        print(f'  "type": "{aniTP}",')
        print(f'  "count": 1\n}},')
    
    print()
    url2 = [print(f"{animeList[count].lstrip()}: {url}") for count, url in enumerate(url)]
    animeURL = input(f"\nOpen {len(animeList)} URL in browser? (Y/N): ")
    if animeURL.lower() in ["y", "yes"]:
        for i in url: webbrowser.open_new_tab(i)

elif animateOption.lower() in ["m", "manga"]:
    mangaList = list(input("Enter Manga: ").split(",")); print()

    for entry in mangaList:
        search = MangaSearch(entry.lstrip())

        manga = Manga(malID := search.results[0].mal_id)
        manEN = manga.title_english
        manJA = manga.title_japanese
        url.append(manUR := manga.url)

        print(f'{{\n  "mal_id": {malID},')
        print(f'  "en_title": "{manEN}",')
        print(f'  "ja_title": "{manJA}",')
        print(f'  "subtitle": "",')
        print(f'  "status": "CR",')
        print(f'  "count": 1\n}},')

    print()
    url2 = [print(f"{mangaList[count].lstrip()}: {url}") for count, url in enumerate(url)]
    animeURL = input(f"\nOpen {len(mangaList)} URL in browser? (Y/N): ")
    if animeURL.lower() in ["y", "yes"]:
        for i in url: webbrowser.open_new_tab(i)
else:
    print("Option Not Available")

# Requirements: 
# pip install mal-api
