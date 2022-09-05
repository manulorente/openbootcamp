
def calcula_area_triangulo(base, altura):
    return (base * altura) / 2

def calcula_area_circulo(radio):
    return 3.1416 * radio ** 2

if __name__ == '__main__':
    print("Area del triangulo = ", calcula_area_triangulo(10, 20))
    print("Area del circulo = ", calcula_area_circulo(10))