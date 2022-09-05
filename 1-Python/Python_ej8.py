
numero_inicial = int(input("Ingrese un numero: "))
numero_final = int(input("Ingrese otro numero: "))

for numero in range(numero_inicial, numero_final + 1):
    if numero % 2 != 0:
        print(numero)
    else:
        pass