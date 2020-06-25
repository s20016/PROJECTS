for row in range(10):
    for col in range(10):
        num = "{:>2}".format((row + 1) * (col + 1))
        print(num, end = " ")
    print()