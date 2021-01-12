import tkinter

count = 0


def count_up():
    global count
    count += 1
    la["text"] = count
    root.after(1000, count_up)


root = tkinter.Tk()
root.title("C1_Timer")
root.geometry("230x200")

la = tkinter.Label()
la["font"] = ("Times New Roman", 150)
la.pack()

count_up()
root.mainloop()
