# Clase llamada alumno
class Alumno():
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota
    def __str__(self):
        return "Nombre: {}\nNota: {}\nAprobado: {}\n".format(self.nombre, self.nota, self.isApproved())
    def __repr__(self):
        return "Alumno('{}', '{}')".format(self.nombre, self.nota)

    def setNombre(self, nombre):
        self.nombre = nombre
    def setNota(self, nota):
        self.nota = nota
    def getNombre(self):
        return self.nombre
    def getNota(self):
        return self.nota
    def isApproved(self):
        if self.nota >= 5:
            return True
        else:
            return False

if __name__ == '__main__':
    alum = Alumno("Andres", 5)
    print(alum)