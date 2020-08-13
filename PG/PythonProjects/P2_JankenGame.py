import random

# Scores:
user_score = 0
comp_score = 0
rematch = 1

while True:
    def num_matches():
        print(f"\n----- Round {rematch} -----")
        match_choice = int(input("\nNumber of Janken Match: "))
        return match_choice

    def User_option():
        user_choice = input("\nChoose Rock, Paper or Scissors: ")
        if user_choice.lower() in ["rock", "r"]:
            user_choice = "r"
        elif user_choice.lower() in ["paper", "p"]:
            user_choice = "p"
        elif user_choice.lower() in ["scissors", "s"]:
            user_choice = "s"
        else: 
            print("Invalid option. Try again.")
            user_choice = User_option()
        return user_choice


    def Computer_option():
        comp_options = ["r", "p", "s"]
        comp_choice = random.choice(comp_options)
        return comp_choice


    for matches in range(num_matches()):

        user_choice = User_option()
        comp_choice = Computer_option()
        
        #Rock
        if user_choice == "r":
            ans = "Rock"
            if comp_choice == "r": 
                print(f"Player: {ans}. Comp: {ans}. TIE!")
                continue
            elif comp_choice == "p":
                print(f"Player: {ans}. Comp: Paper. LOST!")
                comp_score += 1
            else:
                print(f"player: {ans}. Comp: Scissors. WIN!")
                user_score += 1
            
        #Paper
        if user_choice == "p":
            ans = "Paper"
            if comp_choice == "p": 
                print(f"Player: {ans}. Comp: {ans}. TIE!")
                continue
            elif comp_choice == "s":
                print(f"Player: {ans}. Comp: Scissors. LOST!")
                comp_score += 1
            else:
                print(f"Player: {ans}. Comp: Rock. WIN!")
                user_score += 1

        #Scissors
        if user_choice == "s":
            ans = "Scissors"
            if comp_choice == "s": 
                print(f"Player: {ans}. Comp: {ans}. TIE!")
                continue
            elif comp_choice == "r":
                print(f"Player: {ans}. Comp: Rock. LOST!")
                comp_score += 1
            else:
                print(f"Player: {ans}. Comp: Paper. WIN!")
                user_score += 1


    def Match_score():
        if user_score > comp_score: 
            match = "\nYou Won!"
        elif user_score < comp_score:
            match = "\nYou Lost!"
        else: match = "\nTIE!"
        return match


    # Scoreboard
    print(Match_score())
    print(f"Player Score: {user_score}")
    print(f"Computer Score: {comp_score}")


    # Rematch
    user_game = input("\nPlay Again? (y/n): ")
    if user_game.lower() in ["yes", "y"]: 
        user_score = 0
        comp_score =  0
        rematch += 1
        pass
    elif user_game.lower() in ["no", "n"]: 
        print("Game Over!")
        break
    else:
        print("Game Over!")   
        break