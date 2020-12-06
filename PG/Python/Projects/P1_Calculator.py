#! Project 1: Calculator v1.0.0
# Note:
#   1. Do not run in WSL: Ubuntu
#   2. Python3.8.2 64-bit

from tkinter import *

root = Tk()
root.title("Caluculator")

# Number box
num_box = Entry(root, width=43)
num_box.grid(row=0, column=0, columnspan=4, padx=20, pady=10)

# Defining buttons


def button_click(number):
    current = num_box.get()
    num_box.delete(0, END)
    num_box.insert(0, str(current) + str(number))


def button_clear():
    num_box.delete(0, END)


def button_add():
    first_num = num_box.get()
    global f_num
    f_num = int(first_num)
    num_box.delete(0, END)


def button_equal():
    second_num = num_box.get()
    s_num = int(second_num)
    num_box.delete(0, END)
    num_box.insert(0, f_num + s_num)


# Button size:
px = 30
py = 15

button_1 = Button(root, text="1", padx=px, pady=py, command=lambda: button_click(1))
button_2 = Button(root, text="2", padx=px, pady=py, command=lambda: button_click(2))
button_3 = Button(root, text="3", padx=px, pady=py, command=lambda: button_click(3))
button_4 = Button(root, text="4", padx=px, pady=py, command=lambda: button_click(4))
button_5 = Button(root, text="5", padx=px, pady=py, command=lambda: button_click(5))
button_6 = Button(root, text="6", padx=px, pady=py, command=lambda: button_click(6))
button_7 = Button(root, text="7", padx=px, pady=py, command=lambda: button_click(7))
button_8 = Button(root, text="8", padx=px, pady=py, command=lambda: button_click(8))
button_9 = Button(root, text="9", padx=px, pady=py, command=lambda: button_click(9))
button_0 = Button(root, text="0", padx=px, pady=py, command=lambda: button_click(0))

p2x = 30
p2y = 15

button_add = Button(root, text="+", padx=p2x, pady=p2y, command=button_add)  # ADD OK
button_subtract = Button(
    root, text="-", padx=p2x + 1, pady=p2y, command=lambda: button_click()
)  # SUB
button_multiply = Button(
    root, text="x", padx=p2x, pady=p2y, command=lambda: button_click()
)  # MUL
button_divide = Button(
    root, text="/", padx=p2x + 1, pady=p2y, command=lambda: button_click()
)  # DIV
button_equals = Button(
    root, text="=", padx=p2x - 1, pady=p2y, command=button_equal
)  # EQL (Only Add)

button_clear = Button(
    root, text="C", padx=p2x - 1, pady=p2y, command=button_clear
)  # CLR OK

# Output buttons to screen
button_1.grid(row=3, column=0)
button_2.grid(row=3, column=1)
button_3.grid(row=3, column=2)

button_4.grid(row=2, column=0)
button_5.grid(row=2, column=1)
button_6.grid(row=2, column=2)

button_7.grid(row=1, column=0)
button_8.grid(row=1, column=1)
button_9.grid(row=1, column=2)
button_0.grid(row=4, column=1)

button_add.grid(row=4, column=3)
button_subtract.grid(row=3, column=3)
button_multiply.grid(row=2, column=3)
button_divide.grid(row=1, column=3)
button_equals.grid(row=4, column=2)

button_clear.grid(row=4, column=0)


root.mainloop()

# Notes
# .Label(root, text = " ")
#  add      fg/bg = "<Hexcode Color>", state = <DISABLED>, command = <def name>, padx/pady = <num>
# .pack()
# .grid(row = <num>, column = <num>, columnspan = <num>)
# .Entry(root)
# .insert(<num>, "<str>")
# .Button()
