def isBisiesto(year):
    if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
        return True
    else:
        return False

if __name__ == '__main__':
    anio = int(input("Ingrese un año: "))
    print(anio, "es bisiesto" if isBisiesto(anio) else "no es bisiesto")