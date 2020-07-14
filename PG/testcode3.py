import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:

def gcd(a, b):
        a, b = max([a, b]), min([a, b])
        while b:
            a, b = b, a % b
        return a
print(gcd(20, 100))
