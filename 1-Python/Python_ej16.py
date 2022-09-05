import time

if __name__ == '__main__':
    # Get current system time
    t = time.time()
    # If current system time is greater than 7pm, you can go home
    if time.localtime(t).tm_hour > 19:
        print('Ya puedes irte a casa!')
    else:
        print(f'No puedes irte a casa! Te quedan {18 - time.localtime(t).tm_hour}h:{60 - time.localtime(t).tm_min}m')