# ------------------------------- Version Notes ------------------------------ #
# [Project 4] Hit & Blow Game v1
# Random number = 0-9
# Accepts user input errors

import random, sys

# Title
ast25, dash4, spac3 = "*" * 36, "-" * 10, " " * 8
# print(f" {ast25}\n *{spac3}HIT & BLOW GAME v1{spac3}*\n {ast25}")
print(f"\n{dash4} HIT & BLOW GAME {dash4}")


def Comp_option():
    comp_num = []
    while len(comp_num) != 4:
        comp_choice = random.randint(0,9)
        if comp_choice not in comp_num: comp_num.append(comp_choice)
    return comp_num


def User_option():
    user_num_l = []
    while len(user_num_l) != 4:
        print("\n{} {}".format(tab1, " ".join(user_guess)))
        user_choice = list(input(f"{tab1} Enter 4-digits number: "))
        user_num = [int(n) for n in user_choice if n.isdigit()]
        for i in user_num: 
            if len(user_num) == 4:
                if user_num.count(i) == 1: 
                    user_num_l.append(i)
                else:
                    user_num_l.clear()
                    print(f"{spc12}No Repetition of Digit!")   
                    break
            else:
                user_num_l.clear()
                print(f"{spc12 + spc3}   Invalid Answer!")
                break
    return user_num_l

while True:

    # Play Option
    spc3 = " " * 2
    user_game = input(f"\n----- New Game? (y/n): ")
    if user_game.lower() in ["yes", "y"]: pass
    else: print(f"\n{spc3 * 4}THANK YOU FOR PLAYING!{spc3}\n"), sys.exit()

    # Player Info:
    user_guess = list(u"\u2661" * 5)
    user_guess_count = -1
    hit_count = 0
    blow_count = 0
    l1 = [] # Computer Number
    l2 = [] # User Number

    # Comp Info:
    comp_num = Comp_option()
    # print(comp_num) <--- ANSWER

    while True:
        dash4, dash7, spc4, spc12 = "-" * 5, "-" * 8, " " * 4, " " * 8
        tab2, tab1 = " " * 11, " " * 5
        print(f"\n{dash4} GUESS THE NUMBER: * * * * {dash4}")      

        for num in range(5):

            user_num = User_option()

            # Game Mechanics
            for i, num in enumerate(user_num):
                if user_num[i] == comp_num[i]:
                    hit_count += 1
                elif user_num[i] != comp_num[i]: 
                    if user_num[i] in comp_num:
                        blow_count += 1

            # Game Result:
            if hit_count == 4: 
                print(f"\n{tab2}CONGRATULATIONS!")
                user_guess_count = 0
                hit_count, blow_count = 0, 0
                break

            else:
                print(f"{tab2} HIT: {hit_count} | BLOW: {blow_count} {spc4}")
                hit_count, blow_count = 0, 0

            user_guess[user_guess_count] = ""
            user_guess_count += -1

        # Show Computer Random Number
        print(f"\n{tab2}   GAME OVER!")
        print("{} THE NUMBER: {} {} {} {} {}".format(dash7, *comp_num, dash7))

        user_num.clear()
        break