import sys
sys.stdin = open("myProjects/PG/Python/Sem1/input.txt", "r")
sys.stdout = open("myProjects/PG/Python/Sem1/output.txt", "w")
#! TEST CODE 1
# TODO ==============================================================
# TODO START CODE HERE:

import collections

x = collections.Counter(input())
print("OK" if len(x.keys()) == 4 else "NG")