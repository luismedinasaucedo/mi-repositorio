class Nodo:
    def __init__(self,Dato):
        self.Dato=Dato
        self.Izq=None
        self.Der=None

class Arbol:
    def __init__(self):
        self.Raiz=None
    def insertar(self,valor):
        if self.Raiz==None:
            self.Raiz=Nodo(valor)
        else:
            print()
            #
#main
ops=0
while not ops==3:
    ops=int(input("1 insertar\n2 mostrar\n"))
    match ops:
        case 1:
            print()
        