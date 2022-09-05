from functools import reduce

def main(lista):
    return reduce(lambda x, y: x + y, list(filter(lambda x: x % 2, lista)))

if __name__ == '__main__':
    print(main(range(10)))