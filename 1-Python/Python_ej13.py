
class Vehiculo:
    def __init__(self, color = "Rojo", ruedas = 4, puertas = 3):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

class Coche(Vehiculo):
    def __init__(self, color = "Rojo", ruedas = 4, puertas = 3, velocidad = 0, cilindrada = 0):
        super().__init__(color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada
 
 
 
if __name__ == "__main__":
    bmw = Coche("Rojo", 4, 3, 80, 1600)
    print("El coche es de color {}, tiene {} ruedas, {} puertas, su velocidad es {} y sus cilindradas {}".format(bmw.color, bmw.ruedas, bmw.puertas, bmw.velocidad, bmw.cilindrada))

