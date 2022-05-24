import tkinter

root = tkinter.Tk()
root.title("TEST")

cvs = tkinter.Canvas(width=600, height=600, bg="white")
cvs.pack()

ox = 300
oy = 300

cvs.create_text(ox + 20, oy + 15, text=("(0,0)"))
