# ------------------------------- Version Notes ------------------------------ #
# [Project 5] [School Project] Yasumi Desuka? App. v1.2.0
# Curious if a date is holiday or not? Try this app!
# Japan national holidays from year: 2019-2021
# WebAPI from "https://holidays-jp.github.io/api/v1/date.json" & "https://yesno.wtf/api"

# --------------------------- Added Features in v1.2.0: -------------------------- #
# Auto deletion of just created "YasumiApp.html" in 5s
# Catches error from user input
# Added more random Emoji

import os
import random
import time
import webbrowser

import requests as req


def User_answer():
    x = "Enter YYYY-MM-DD (Ex. 2020-08-10)"
    user_input = str(input(f"\n{x}\n---- 休みですか？: "))
    try:
        date = list(user_input.split("-"))
        if 2019 <= int(date[0]) <= 2021:
            if 1 <= int(date[1]) <= 12:
                if 1 < int(date[2]) <= 31:
                    user_input = "-".join(date)
                else:
                    print("---- Invalid Day")
                    user_input = User_answer()
            else:
                print("---- Invalid Month")
                user_input = User_answer()
        else:
            print("---- Invalid Year")
            user_input = User_answer()
    except ValueError:
        print("---- Invalid Input")
        user_input = User_answer()
    return user_input


def JP_holidays():
    # Japan holidays
    jp_url = "https://holidays-jp.github.io/api/v1/date.json"
    holidays_jp = req.get(jp_url).json()
    return holidays_jp


def App_answer(user_response, yn_img, ans, ans2, ans3):
    # Emoticon
    yes_emoji = [
        "&#x1F44D",
        "&#x1F44F",
        "&#x1F600",
        "&#x1F601",
        "&#x1F602",
        "&#x1F606",
        "&#x1F60D",
        "&#x1F47D",
        "&#x1F64C",
        "&#x1F64F",
    ]
    no_emoji = [
        "&#x1F44E",
        "&#x1F4A9",
        "&#x1F610",
        "&#x1F611",
        "&#x1F612",
        "&#x1F614",
        "&#x1F616",
        "&#x1F620",
        "&#x1F624",
        "&#x1F630",
    ]

    if ans2 == "yes":
        x, y, z = random.choices(yes_emoji, k=3)
    else:
        x, y, z = random.choices(no_emoji, k=3)

    # Creating new HTML File
    file = open(file_name := "./YasumiApp.html", "w")

    # HTML Content
    img_style = f"* {{margin: 0; padding: 0; background-image: url({yn_img}); \
        background-size: cover; color: rgb(255, 200, 61); \
        font-family: 'MS Gothic', 'Arial'; text-align: center; \
        text-shadow: 0 2px 2px rgba(0,0,0,0.5);}}"

    ans_style = f"h1 {{font-size: 80px; text-transform: uppercase; \
        position: absolute; top: 50%; left: 50%; \
        transform:translate(-50%, -50%); background: transparent; \
        color: rgb(255, 200, 61); line-height: 1.4;}}"

    emoji_style = f"span {{font-size: 40px; background: transparent;}}"

    event_style = (
        f"h2 {{padding-top: 15rem; font-size: 37px; background: transparent;}}"
    )

    html_content = f"<html><head>\n<style>{img_style}\n{ans_style}\n \
        {emoji_style}\n{event_style}</style>\n<title>休みですか？</title>\
        </head>\n<body><h2>{ans3}</h2><h1>{ans}<br><span>{x}{y}{z}</span></h1>\
        </body>\n</html>"

    file.write(html_content)
    file.close()
    return file_name


def Correct_response(correct_ans):
    # Finding perfect gif for App_answer
    yn_url = "https://yesno.wtf/api"
    yn_response_img = req.get(yn_url).json()["image"]
    res = list(yn_response_img.split("/"))[4]

    if res == correct_ans:
        yn_response_img
    else:
        yn_response_img = Correct_response(correct_ans)
    return yn_response_img


# Main
d5, d = "-" * 5, " " * 12
print(f"\n{d5}{d5} Yasumi Desuka? {d5}{d5}")
print(f"{d} 2019-2021")

user_input = User_answer()
holidays_jp = JP_holidays()

if user_input in holidays_jp.keys():
    event = holidays_jp[user_input]
    response_output, emoji_output = "休みだ！！", "yes"
    yn_response_img = Correct_response(emoji_output)
    file_name = App_answer(
        user_input, yn_response_img, ans=response_output, ans2=emoji_output, ans3=event
    )
else:
    response_output, emoji_output = "休みじゃない！！", "no"
    yn_response_img = Correct_response(emoji_output)
    file_name = App_answer(
        user_input, yn_response_img, ans=response_output, ans2=emoji_output, ans3=""
    )

# Open HTML in browser
webbrowser.open_new_tab(file_name), print()

# Comment out the code below to disbale auto delete of "YasumiApp.html". Countdown: 5s
time.sleep(5)
os.remove("./YasumiApp.html")
