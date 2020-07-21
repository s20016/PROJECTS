import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 1
# TODO ==============================================================
# TODO START CODE HERE:

#exec("print(int(input()) % 24)")
#print(int(input()) % 24)

#* Reading vertical input()
#lines = [line.strip() for line in sys.stdin.readlines()]
#x = list(map(int, [i for i in lines]))
# --> x = list(map(int, [line.strip() for line in sys.stdin.readlines()]))

#* Reading horizonatal line input()
#x = list(map(int, input().split()))
#x, y = map(int, input().split())

#* Splitting 1 horizontal str input()
#x = list(map(str, [i for i in sys.stdin.readline()]))

#* Reading multiple lines, with multiple horizontal input() into int
#l = []
#for i in range(n):
#    x = list(map(int, [i for i in sys.stdin.readline().split()]))
#    l.append(x)

