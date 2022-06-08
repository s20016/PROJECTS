# Bubblesort
import datetime

data = list(map(int, input().split(" ")))
n = len(data)

start_time = datetime.datetime.now()

for i in range(0, n - 1):
    for j in range(n - 1, i, -1):
        if data[j - 1] > data[j]:
            data[j], data[j - 1] = data[j - 1], data[j]

print(data)

end_time = datetime.datetime.now()
time_diff = end_time - start_time
execution_time = time_diff.total_seconds() * 1000

print(execution_time)
