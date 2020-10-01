import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 2
# TODO ==============================================================
# TODO START CODE HERE:

"""
x = [input() for _ in range(3)]
y = [int(input()) for _ in range(3)]

a = dict(zip([input() for _ in range(3)], [int(input()) for _ in range(3)]))

print(a)
print(a.values())
print([[k, v] for k, v in a.items()])
"""

a = dict(zip(list('ABC'), [int(i) for i in list("123")]))
print(a)