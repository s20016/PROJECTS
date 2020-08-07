import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:

# l = []

for i in range(1, 11): 
    for j in range(i + 1): 
        # l.append("*" * j)
        print("*" * j)
    



# print("\n".join(l))