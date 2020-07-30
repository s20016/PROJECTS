import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:


n = int(input())
x = [list(input()) for _ in range(n)]

# [['0', '0', '1', '1'], ['0', '1', '1', '0']]

print(x)