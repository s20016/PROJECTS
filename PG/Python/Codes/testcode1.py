import random

# i = [3, 10, 25, 70, 100]

# for n in i:
#     x = random.sample(range(100), n)
#     y = [f"{i:02d}" for i in x]

#     print(*y)
#     print()

x = [input() for _ in range(5)]
# print(x)

d = list(map(int, x[4].split(" ")))
print(d)

# import datetime
# start_time = datetime.datetime.now()
#   # Insert Sort Function

# end_time = datetime.datetime.now()
# time_diff = end_time - start_time
# execution_time = time_diff.total_seconds() * 1000

# print(execution_time)
