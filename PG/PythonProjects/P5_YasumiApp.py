# ------------------------------- Version Notes ------------------------------ #
# [Project 5] [School Project] WebAPI: 休みですか？ v1
# Japan Holidays: 2019-2021
# User input must be: yyyy-mm-dd (ex. 2020-08-10)
# WebAPI from "https://holidays-jp.github.io/api/v1/date.json" & "https://yesno.wtf/api"

import requests as req
import webbrowser, random

def JP_holidays():
    # Japan holidays
    jp_url = "https://holidays-jp.github.io/api/v1/date.json"
    holidays_jp = req.get(jp_url).json()
    return holidays_jp

def App_answer(user_response, yn_img, ans, ans2):
    # Emoticon
    yes_emoji = ["&#x1F44D", "&#x1F44F", "&#x1F600", "&#x1F601", "&#x1F602", "&#x1F606", "&#x1F60D", "&#x1F47D", "&#x1F64C", "&#x1F64F"]
    no_emoji = ["&#x1F44E", "&#x1F4A9", "&#x1F610", "&#x1F611", "&#x1F612", "&#x1F614", "&#x1F616", "&#x1F620", "&#x1F624", "&#x1F630"]

    if ans2 == "yes": x, y, z = random.choices(yes_emoji, k=3)
    else: x, y, z = random.choices(no_emoji, k=3)

    # Creating new HTML File
    file = open(file_name := "YasumiApp.html","w")
    # file_name = f"{user_response}.html"

    # HTML Content
    img_style = f"* {{margin: 0; padding: 0; background-image: url({yn_img}); background-size: cover;}}"

    ans_style = f"h1 {{font-size: 80px; text-transform: uppercase; text-align: center; position: absolute; top: 50%; left: 50%; transform:translate(-50%, -50%); background: transparent; color: rgb(255, 200, 61); font-family: 'MS Gothic', 'Arial'; line-height: 1.4; text-shadow: 0 2px 2px rgba(0,0,0,0.5);}}"
    ans_emoticon = f"span {{font-size: 40px; background: transparent;}}"
    html_content = f"<html><head>\n<style>{img_style}\n{ans_style}\n{ans_emoticon}</style>\n<title>休みですか？</title></head>\n<body><h1>{ans}<br><span>{x}{y}{z}</span></h1></body>\n</html>"

    file.write(html_content)
    file.close()
    return file_name

def Correct_response(correct_ans):
    # Finding perfect gif for App_answer
    yn_url = "https://yesno.wtf/api"
    yn_response_img = req.get(yn_url).json()["image"]
    res = list(yn_response_img.split("/"))[4]

    if res == correct_ans: yn_response_img
    else: yn_response_img = Correct_response(correct_ans)
    return yn_response_img

# Main Loop
user_input = input("\n休みですか？: ")

holidays_jp = JP_holidays()

if user_input in holidays_jp.keys():
    response_output, emoji_output = "休みだ！！", "yes"
    yn_response_img = Correct_response(emoji_output)
    file_name = App_answer(user_input, yn_response_img, ans = response_output, ans2 = emoji_output)
else:
    response_output, emoji_output = "休みじゃない！！", "no"
    yn_response_img = Correct_response(emoji_output)
    file_name = App_answer(user_input, yn_response_img, ans = response_output, ans2 = emoji_output)

# Open HTML in browser
webbrowser.open_new_tab(file_name)