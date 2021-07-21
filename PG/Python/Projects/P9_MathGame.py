import random, functools

# Get random number
def set_numbers():
    max_num = int("1" + (random.choice([1, 2, 3]) * "0")) - 1
    ran_opt = random.choice(["+", "-", "*", "/"])
    ran_num = random.sample(range(1, max_num), 2)
    return ran_num, ran_opt
    
# Question
def set_question():
    nums, opt = set_numbers(); ans = 0
    question = f"{nums[0]} {opt} {nums[1]}"
    if opt == "+": ans = functools.reduce(lambda a, b: a + b, nums)
    if opt == "-": ans = functools.reduce(lambda a, b: a - b, nums)
    if opt == "*": ans = functools.reduce(lambda a, b: a * b, nums)
    if opt == "/": ans = "{:.2f}".format(functools.reduce(lambda a, b: a / b, nums))
    return question, str(ans)

# Main
question, answer = set_question()
health = list("\u2661" * 5)
count, score, spc = 0, 0," "; print()

while (health != 1):
    hbar = " ".join(health)
    usr_ans = str(input(f"  {hbar}{spc * count}  {question}: "))
    if usr_ans == answer:
        question, answer = set_question(); score += 1
    else: 
        if len(health) <= 1: print(f"\n  Game Over! Score: {score}\n"); break
        else: health.pop(); count += 2


# TODO: 
# Fix decimal
# Lessen division denominator
# Inverse division. Max first