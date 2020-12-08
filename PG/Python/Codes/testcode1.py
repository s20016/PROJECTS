import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 1
# =========================================================================

def string_splosion(str):
    l = []; count = 1
    for i in str:
        l.append(str[:count])
        count += 1
    print("".join(l))

string_splosion('Code')
string_splosion('abc')
string_splosion('ab')