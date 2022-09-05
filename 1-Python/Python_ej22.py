import tkinter as tk

# Create window with list box and buttons
window = tk.Tk()
window.title('List Box')
window.geometry('200x300')
# Create a list box
listbox = tk.Listbox(window)
listbox.insert(tk.END, 'Option 1')
listbox.insert(tk.END, 'Option 2')
listbox.insert(tk.END, 'Option 3')
listbox.insert(tk.END, 'Option 4')
listbox.insert(tk.END, 'Option 5')
listbox.insert(tk.END, 'Option 6')
listbox.pack()
# Create a button to select all items
tk.Button(window, text='Select All', command=lambda: listbox.select_set(0, tk.END)).pack()
# Create a button to deselect all items
tk.Button(window, text='Deselect All', command=lambda: listbox.select_clear(0, tk.END)).pack()
# Create a button to get selected items
tk.Button(window, text='Get Selected', command=lambda: print(listbox.curselection())).pack()
window.mainloop()

