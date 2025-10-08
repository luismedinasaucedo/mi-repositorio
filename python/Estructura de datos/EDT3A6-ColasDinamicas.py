class Nodo:
    def __init__(self,Dato):
        self.Dato=Dato
        self.Sig=None
    

class Cola:
    def __init__(self):
        self.fin=None
        self.inicio=None

    def encolar(self,d):
        Nodo1 =Nodo(d)
        if self.inicio==None:
            self.inicio=self.fin=Nodo1
        else:
            self.fin.Sig=Nodo1

    def ColaVacia(self):
        return self.inicio==None
    
    def mostrar(self):
        if self.ColaVacia():
            print("La cola esta vacia")
        Aux=self.inicio
        while(not Aux==None):
            print(Aux.Dato)
            Aux=Aux.Sig
    def desencolar(self):
        if self.ColaVacia():
            print("La cola esta vacia")
            return None
        s=self.inicio.Dato
        self.inicio=self.inicio.Sig
        return s
        
        
cola1=Cola()
ops=0
while not ops==4:
    print("1.- añadir")
    print("2.- eliminar")
    print("3.- mostrar")
    print("4.- salir")
    ops=int(input("elige la opcion: "))
    match ops:
        case 1:
            cola1.encolar(input("escribe el dato a agregar: "))
        case 2:
            cola1.desencolar()
        case 3:
            cola1.mostrar()
