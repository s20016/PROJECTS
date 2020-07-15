import sys
sys.stdout = open("output.txt", "w")
sys.stdin = open("input.txt", "r")
#! TEST CODE 3
# TODO ==============================================================
# TODO START CODE HERE:

def f(text):
    text = text.replace('&', '\&').replace('#', '\#')
    return text
print(f("abc&def#ghi"))

f = lambda text : text.replace('&', '\&').replace('#', '\#')
print(f("abc&def#ghi"))


