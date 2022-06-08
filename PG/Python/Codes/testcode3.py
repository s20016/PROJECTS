# Mergesort
import datetime

data = list(map(int, input().split(" ")))
n = len(data)


def merge(left, mid, right):
    buff = [0] * (right - left)
    i = left
    j = mid
    p = 0
    while i < mid and j < right:
        if data[i] <= data[j]:
            buff[p] = data[i]
            i += 1
            p += 1
        else:
            buff[p] = data[j]
            j += 1
            p += 1
    while i < mid:
        buff[p] = data[i]
        i += 1
        p += 1
    while j < right:
        buff[p] = data[j]
        j += 1
        p += 1
    for n in range(left, right):
        data[n] = buff[n - left]


start_time = datetime.datetime.now()

s = 2
while s <= n:
    loop = n // s
    fragment = n % s
    for i in range(loop):
        merge(i * s, i * s + (s // 2), i * s + s)
    if fragment > 0:
        merge((loop - 1) * s, loop * s, n)
    s = s * 2

print(data)

end_time = datetime.datetime.now()
time_diff = end_time - start_time
execution_time = time_diff.total_seconds() * 1000

print(execution_time)
