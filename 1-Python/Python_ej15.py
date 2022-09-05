from calculadora.operaciones import sumar, restar, multiplicar, dividir

if __name__ == '__main__':
    num1 = int(input('Ingrese el primer numero: '))
    num2 = int(input('Ingrese el segundo numero: '))
    print('La suma es: ', sumar(num1, num2))
    print('La resta es: ', restar(num1, num2))
    print('La multiplicacion es: ', multiplicar(num1, num2))
    print('La division es: ', dividir(num1, num2))