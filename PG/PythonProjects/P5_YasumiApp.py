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
    # Creating new HTML File
    file = open(file_name := "YasumiApp.html","w")
    # file_name = f"{user_response}.html"

    # HTML Content
    img_style = f"* {{margin: 0; padding: 0; background-image: url({yn_img}); background-size: cover;}}"

    ans_style = f"h1 {{font-size: 80px; text-transform: uppercase; text-align: center; position: absolute; top: 50%; left: 50%; transform:translate(-50%, -50%); background: transparent; color: white; font-family: 'MS Gothic', 'Arial'; line-height: 1.4; text-shadow: 0 2px 2px rgba(0,0,0,0.5);}} "

    ans_emoticon = f"span {{font-size: 40px; background: transparent;}}"

    html_content = f"<html><head>\n<style>{img_style}\n{ans_style}\n{ans_emoticon}</style>\n<title>休みですか？</title></head>\n<body><h1>{ans}<br><span>{ans2}</span></h1></body>\n</html>"

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

# User input()
user_input = input("\n休みですか？: ")

# Main mechanics
holidays_jp = JP_holidays()

if user_input in holidays_jp.keys():
    emoticon = random.choice(["ヽ(*⌒▽⌒*)ﾉ", "(≧◡≦) ♡", "(￢‿￢ )", "╰(▔∀▔)╯"])
    yn_response_img = Correct_response("yes")
    file_name = App_answer(user_input, yn_response_img, ans = "休みだ！！", ans2 = emoticon)
else:
    emoticon = random.choice(["(；￣Д￣)", "(￣ヘ￣)", "(」°ロ°)」", "(⇀‸↼‶)"])
    yn_response_img = Correct_response("no")
    file_name = App_answer(user_input, yn_response_img, ans = "休みじゃない！！", ans2 = emoticon)

# Open HTML in browser
webbrowser.open_new_tab(file_name)