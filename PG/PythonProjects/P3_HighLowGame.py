import random, sys

# Title
ast14 = "*" * 14
print(f" {ast14}\n * HIGH & LOW *\n {ast14}")

# Scoreboard
user_score = 0
game_round = 1
highscore = []

def Comp_option():
    f_card, s_card = [random.randint(1, 9) for _ in range(2)]
    return f_card, s_card


def User_option(num):
    user_choice = input(f"\n== R{game_round}: High or Low? (h/l): ")
    if user_choice.lower() in ["h", "l"]:
        return user_choice.lower()
    else: 
        print("Invalid Option")
        sys.exit()
        

def User_number(answer, f_card):
    if answer == "h": user_number = f_card + 1
    elif answer == "l": user_number = f_card - 1
    return user_number

while True:
    user_game = input(f"\nPlay? (y/n): ")
    if user_game.lower() in ["yes", "y"]: 
        highscore.append(user_score)
        user_score = 0
        game_round = 1
        pass
    else:
        h_score = highscore.append(user_score)
        print(f"\nHighscore: {max(highscore)}, Game Over!\nTHANK YOU FOR PLAYING!")
        user_score = 0
        game_round = 1
        sys.exit()

    while True:
        f_card, s_card = Comp_option()

        # Card section
        ast, tab, f_ast = "*" * 5, " " * 4, "*" * 3
        spc = "*{}*".format(" " * 3)
        fcd, scd = "* {} *".format(f_card), "* {} *".format(s_card)

        initial_card = f"\n {ast}{tab}{ast}\n {spc}{tab}{ast}\n {fcd}{tab}{ast}\n {spc}{tab}{ast}\n {ast}{tab}{ast}"
        reveal_card = f"\n {ast}{tab}{ast}\n {spc}{tab}{spc}\n {fcd}{tab}{scd}\n {spc}{tab}{spc}\n {ast}{tab}{ast}\n"


        print(f"{initial_card}")

        user_choice = User_option(f_card)
        user_number = User_number(user_choice, f_card)

        if user_choice == "h":
            if s_card > f_card or s_card == f_card: 
                user_score += 1
                print(f"{reveal_card}\nYou Won! Score: {user_score}")
            else: 
                print(f"\n{reveal_card}\nYou Lost! Final Score: {user_score}\n{f_ast}GAME OVER!{f_ast}")
                break

        if user_choice == "l":
            if s_card < f_card or s_card == f_card: 
                user_score += 1
                print(f"{reveal_card}\nYou Won! Score: {user_score}")
            else: 
                print(f"\n{reveal_card}\nYou Lost! Final Score: {user_score}\n{f_ast} GAME OVER! {f_ast}")
                break

        game_round += 1