import random, functools

def set_numbers():
    ran_opt = random.choice(["+", "-", "*", "/", "^"])
    if ran_opt == "+":
        max_num = int("1" + (random.choice([1, 2, 3]) * "0")) - 1
        ran_num = random.sample(range(1, max_num), 2)
    return ran_num, ran_opt

# Question
def set_question():
    nums, opt = set_numbers(); ans = 0
    question = f"{nums[0]} {opt} {nums[1]}"
    if opt == "+": ans = functools.reduce(lambda a, b: a + b, nums)
    if opt == "-": ans = functools.reduce(lambda a, b: a - b, nums)
    if opt == "*": ans = functools.reduce(lambda a, b: a * b, nums)
    if opt == "^": ans = functools.reduce(lambda a, b: a ** b, nums)
    if opt == "/": ans = "{:.2f}".format(functools.reduce(lambda a, b: a / b, nums))
    return question, str(ans)


# TODO:
# Randomize operator. Depending on the operator, number place changes
# IF + or -: Up to 3 number places
# IF * or / or **: 2 number places
# NO negative answers.
