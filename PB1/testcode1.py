import sys
sys.stdout = open("/home/s20016/pythonlesson/CP/output.txt", "w")
sys.stdin = open("/home/s20016/pythonlesson/CP/input.txt", "r")


BIG_NUM = 2000000000

while True:

    H,W = map(int,input().split())
    if H == 0 and W == 0:
        break
    for i in range(H):
        for k in range(W):
            if (i+k)%2 == 0:
                print("#",end = "")
            else:
                print(".",end = "")
        print()

    print() #データセットの区切り
