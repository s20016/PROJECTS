import sys
sys.stdout = open("/home/s20016/pythonlesson/CP/output.txt", "w")
sys.stdin = open("/home/s20016/pythonlesson/CP/input.txt", "r")


a, b = map(int, input().split())
line = ""

# pattern: #.#.#.#
for i in range(0, a):
    if i%2 == 0:
        i = "#"
        line += i
    else:
        i = "."
        line += i


print("{:>4}".format(line))
print(line)


"""
# pattern: .#.#.#.
for i in range(0, a):
    if i%2 == 0:
        i = "."
        line += i
    else:
        i = "#"
        line += i
print(line)


"""