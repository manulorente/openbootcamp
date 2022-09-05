import tkinter as tk

def select(variable):
    """Select the given variable."""
    variable.get()

def reset(variable):
    """Reset the given variable."""
    variable.set(None)

if __name__ == '__main__':
    window = tk.Tk()
    option = tk.StringVar()
    option.set(None)
    window.title('Radio Button')
    window.geometry('300x200')
    tk.Radiobutton(window, text='Option 1', variable=option, value='1', command=lambda: select(option)).pack(anchor=tk.W)
    tk.Radiobutton(window, text='Option 2', variable=option, value='2', command=lambda: select(option)).pack(anchor=tk.W)
    tk.Radiobutton(window, text='Option 3', variable=option, value='3', command=lambda: select(option)).pack(anchor=tk.W)
    # Create a button to reset radio button
    tk.Button(window, text='Reset', command=lambda: reset(option)).pack(anchor=tk.W)
    window.mainloop()