import pickle

class Vehiculo():
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.enMarcha = False
        self.acelera = False
        self.frena = False

    def arrancar(self):
        self.enMarcha = True

    def acelerar(self):
        self.acelera = True

    def frenar(self):
        self.frena = True

    def estado(self):
        print("Marca: ", self.marca, "\nModelo: ", self.modelo, "\nEn marcha: ", self.enMarcha, "\nAcelerando: ", self.acelera, "\nFrenando: ", self.frena)


if __name__ == '__main__':
    c1 = Vehiculo("Seat", "Panda")
    with open("Python_ej18.bin", "wb") as f:
        pickle.dump(c1, f)
    with open("Python_ej18.bin", "rb") as f:
        c2 = pickle.load(f)
    c2.estado()