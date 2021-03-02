import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

import tmp_animate as animate

for i in range(len(animate.l4)):
    print(f'{{\n  "mal_id": {animate.l4[i]},\n  "en_title": "{animate.l3[i]}",\n  "ja_title": "{animate.l5[i]}",\n  "subtitle": "",\n  "type": "{animate.l6[i]}",\n  "count": 1\n}},')
