# ------------------------------- Version Notes ------------------------------ #
# [Project 3] High & Low Game v.2
# Card number UP TO 13 (Added A, J, Q, K, strenght = 1, 11, 12, 13 respectively)
# Card CONTINUES from next revealed card.
# Added GT sign or LT sign at each reveal of unkwown card.

import random, sys

# Title
ast25 = "*" * 27
dash4 = "-" * 3
spac3 = " " * 6
# print(f" {ast25}\n *{spac3}HIGH & LOW v2{spac3}*\n {ast25}")
print(f"\n {dash4} HIGH & LOW GAME v2 {dash4}-")

# Scoreboard
user_score = 0
game_round = 1
highscore = []

# Deck
deck = {1:"A", 2:"2", 3:"3", 4:"4", 5:"5", 6:"6", 7:"7", 8:"8", 9:"9", 10:"10", 11:"J", 12:"Q", 13:"K"}
s_card_seq = []

def Comp_option():
    f_card, s_card = [random.choice(list(deck.keys())) for _ in range(2)]
    return f_card, s_card


def User_option(num):
    user_choice = input(f"\n-- R{game_round}: High or Low? (h/l): ")
    if user_choice.lower() in ["h", "l"]:
        return user_choice.lower()
    else: 
        print("Invalid Option")
        sys.exit()
        

def User_number(answer, f_card):
    if answer == "h": user_number = int(f_card) + 1
    elif answer == "l": user_number = int(f_card) - 1
    return user_number

while True:
    user_game = input(f"\n---- Play? (y/n): ")
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
        def Deck_continue():
            if game_round == 1:
                f_card, s_card = Comp_option()
                return f_card, s_card
            elif game_round > 1:
                f_card, s_card = Comp_option()
                f_card = s_card_seq[-1]
                return f_card, s_card

        ast, tab2, tab, f_ast = "*" * 5, " " * 2, " " * 5, "*" * 3
        spc = "*{}*".format(" " * 3)

        f_card, s_card = Deck_continue()

        fn_card = deck[f_card]
        sn_card = deck[s_card]

        if s_card < f_card:
            symbol = ">" 
        else: symbol = "<"

        if fn_card == "10": 
            fcd = "*{} *".format(fn_card)
            if sn_card == "10": scd = "*{} *".format(fn_card)
            else: scd = "* {} *".format(sn_card)
        elif sn_card == "10": 
            scd = "*{} *".format(sn_card)
            if fn_card == "10": fcd = "*{} *".format(fn_card)
            else: fcd = "* {} *".format(fn_card)
        else: 
            fcd, scd = "* {} *".format(fn_card), "* {} *".format(sn_card)

        initial_card = f"\n {ast}{tab}{ast}\n {spc}{tab}{ast}\n {fcd}{tab}{ast}\n {spc}{tab}{ast}\n {ast}{tab}{ast}"

        reveal_card = f"\n {ast}{tab}{ast}\n {spc}{tab}{spc}\n {fcd}{tab2}{symbol}{tab2}{scd}\n {spc}{tab}{spc}\n {ast}{tab}{ast}\n"

        print(f"{initial_card}")

        user_choice = User_option(f_card)
        user_number = User_number(user_choice, f_card)

        if user_choice == "h":
            if s_card > f_card or s_card == f_card: 
                user_score += 1
                gt = "<"
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
        
        s_card_seq.append(s_card)
        game_round += 1