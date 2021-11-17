import json
import sys

import requests
from mal import Anime, AnimeSearch

# sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
# sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 5
# =========================================================================


url = "https://raw.githubusercontent.com/czekras/Animate/master/public/data/anime_list.json"
data = requests.get(url).json()

# json_obj = json.loads(data)
# json_str = json.dumps(json_obj, indent=2)

# for item in data["anime"]:
#     print(item := json.dumps(item, indent=2))

for id in range(0, 2):
    anime_id = data["anime"][id]
    x = '{ "pin": 0002222333 }'
    anime_json = json.loads(anime_id).update(x)
    # anime_json.update(x)
    # print(json.dumps(anime_json))
    print(anime_json)


# for i, x in enumerate(data["anime"]):
#     print(x["mal_id"])
#     if i % 20 == 0 and i > 19:
#         print()

# mal_id = sys.stdin.read().split("\n")

# for i in data["anime"]:
#     anime = Anime(i["mal_id"])
#     print(anime.url)
#     print(anime.image_url)
#     print()

# print(data["anime"][0]["mal_id"])
