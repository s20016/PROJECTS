import sys

sys.stdin = open("/home/czekras/PROJECTS/PG/Python/Codes/input.txt", "r")
sys.stdout = open("/home/czekras/PROJECTS/PG/Python/Codes/output.txt", "w")

# TEST CODE 2
# =========================================================================

# row = number of records, col = data types of each records
row, col = 3, ["CHAR", "VARCHAR", "INT", "INT", "INT", "INT", "INT", "CHAR"]

data_value, database = [], []
data1 = list(map(lambda x: x.lower(), col))
data2 = [input().split() for _ in range(row)]

for count in range(row):
    for num, value in enumerate(data2[count]):
        if data1[num] in ["char", "varchar", "date"]:
            if value == "(NULL)":
                data_value.append("NULL")
            else:
                data_value.append(f"'{value}'")
        if data1[num] in ["int"]:
            data_value.append(value)
        if num == len(col) - 1:
            record = ", ".join([x for x in data_value])
            if count == row - 1:
                database.append(f"({record});")
            else:
                database.append(f"({record})")
            data_value.clear()

print(*database, sep=",\n")
