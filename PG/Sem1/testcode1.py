import sys
sys.stdout = open("PG/Sem1/output.txt", "w")
sys.stdin = open("PG/Sem1/input.txt", "r")
#! TEST CODE 1
# TODO ==============================================================
# TODO START CODE HERE:

n = int(input())
x = [int(input()) for _ in range(7)]

print(n if sum(x) >= n else sum(x))