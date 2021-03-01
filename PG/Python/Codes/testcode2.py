import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

for i in range(len(l4)):
    print(f'{{\n  "mal_id": {l4[i]},\n  "en_title": "{l3[i]}",\n  "ja_title": "{l5[i]}",\n  "subtitle": "",\n  "type": "{l6[i]}",\n  "count": 1\n}},')
