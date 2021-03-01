from mal import Anime, AnimeSearch, Manga, MangaSearch

animateOption = input(f"Animate list for Anime/Manga (A/M): ")

if animateOption.lower() in ["a", "anime"]:
    search = AnimeSearch(input("Enter Anime: "))

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
    print(f"\nCheck: {aniUR}\n")
elif animateOption.lower() in ["m", "manga"]:
    search = MangaSearch(input("Enter Manga: "))

    manga = Manga(malID := search.results[0].mal_id)
    manEN = manga.title_english
    manJA = manga.title_japanese
    manUR = manga.url

    print(f'\n{{\n  "mal_id": {malID},')
    print(f'  "en_title": "{manEN}",')
    print(f'  "ja_title": "{manJA}",')
    print(f'  "subtitle": "",')
    print(f'  "status": ""\n}}')
    print(f"\nCheck: {manUR}\n")
else:
    print("Option Not Available")


# Requirements: 
# pip install mal-api
