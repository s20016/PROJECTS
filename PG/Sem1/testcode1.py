import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 1
# TODO ==============================================================
# TODO START CODE HERE:
"""
a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

print(list(map(lambda x: x + 10, a)))

print(list(filter(lambda x: x % 2 == 0,  a)))
"""
print(*range(10, 0, -1), sep="\n")
