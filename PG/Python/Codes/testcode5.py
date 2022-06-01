# Bubblesort
import datetime

data = []
n = len(data)

for i in range(0, n - 1):
    for j in range(n - 1, i, -1):
        if data[j - 1] > data[j]:
            data[j], data[j - 1] = data[j - 1], data[j]

start_time = datetime.datetime.now()

# Insert Sort Function
print(data)

end_time = datetime.datetime.now()
time_diff = end_time - start_time
execution_time = time_diff.total_seconds() * 1000

print(execution_time)
