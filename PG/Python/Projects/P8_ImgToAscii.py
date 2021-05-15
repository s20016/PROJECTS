from PIL import Image, ImageDraw, ImageFont
import math
import os

asciiLvl = [' ', '.', '"', '`', '^', '"', ',', ':', ';', 'I', 'l', '!', 'i',
            '~', '+', '_', '-', '?', ']', '[', '1', ')', '(', '|', '\\', '/',
            't', 'f', 'j', 'r', 'x', 'n', 'u', 'v', 'c', 'z', 'X', 'Y', 'U',
            'J', 'C', 'L', 'Q', '0', 'O', 'Z', 'm', 'w', 'q', 'p', 'd', 'b',
            'k', 'h', 'a', 'o', '*', '#', 'M', 'W', '&', '8', '%', 'B', '@', '$']

asciiLen, intvl = len(asciiLvl), len(asciiLvl)/256
asciiW, asciiH, scale = 10, 10, 0.5


def getAscii(inputInt):
    return asciiLvl[math.floor(inputInt * intvl)]


textFile = open("./output.txt", "w")
img = Image.open("1.png")

# Windows font file
# fnt = ImageFont.truetype("/mnt/c/Windows/Fonts/cour.ttf", 16)

# Ubnutu font file
fnt = ImageFont.truetype("/usr/share/fonts/truetype/NotoMono-Regular.ttf", 16)

W, H = img.size
img = img.resize(
    (int(scale * W), int(scale * H * (asciiW/asciiH))), Image.NEAREST)

W, H = img.size
pic = img.load()

outputImg = Image.new("RGB", (asciiW * W, asciiH * H), color=(0, 0, 0))
pic2 = ImageDraw.Draw(outputImg)

for px1 in range(H):
    for px2 in range(W):
        R, G, B = pic[px2, px1]
        h = int((R + G + B)/3)
        pic[px2, px1] = (h, h, h)
        textFile.write(getAscii(h))
        pic2.text((px2 * asciiW, px1 * asciiH),
                  getAscii(h), font=fnt, fill=(R, G, B))
    textFile.write("\n")

outputImg.save("./output.png")
os.remove("./output.txt")


# Requirements:
# pip3 install Pillow
