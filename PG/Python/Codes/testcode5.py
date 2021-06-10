import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 5
# =========================================================================


def last2(str):
    # if len(str) == 0:
    #   return 0
    # elif len(str) == 4:
    #   rest = str[:-2]
    #   w = int(rest.count(str[-2:]))
    #   return w + 1
    # elif str == "axxxaaxx":
    #   return 2
    # rest = str[:-2]
    # w = int(rest.count(str[-2:]))
    return str[:-2].count(str[:2])


print(last2("hixxhi"))
