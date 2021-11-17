import requests as req


def searchAnime(title):
    url = f"https://api.jikan.moe/v3/search/anime?q={title}&limit=1"
    return req.get(url).json()
