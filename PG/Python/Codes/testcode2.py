# Quicksort
import datetime

data = []
n = len(data)


def quick_sort(left, right):
    i = left
    j = right
    p = data[(left + right) // 2]
    while True:
        while data[i] < p:
            i = i + 1
        while data[j] > p:
            j = j - 1
        if i >= j:
            break
        data[i], data[j] = data[j], data[i]
        i = i + 1
        j = j - 1
    if left < i - 1:
        quick_sort(left, i - 1)
    if right > j + 1:
        quick_sort(j + 1, right)


start_time = datetime.datetime.now()

# Insert Sort Function
quick_sort(0, n - 1)
print(data)

end_time = datetime.datetime.now()
time_diff = end_time - start_time
execution_time = time_diff.total_seconds() * 1000

print(execution_time)
