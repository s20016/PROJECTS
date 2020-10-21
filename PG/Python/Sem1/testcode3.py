import sys
sys.stdin = open("input.txt", "r")
sys.stdout = open("output.txt", "w")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:

import string

alphabet = list(string.ascii_lowercase)
x = list(map(int, input().split()))
A = dict(zip(alphabet, x))
y = list(map(str, input()))

l = []

for char in y:
    count = A.get(char)
    if count > 0:
        l.append(char)
        A[char] = count - 1

print("".join(l))