class cola:
    def __init__(self,Max:int):
        self.inicio=self.fin=-1
        self.Datos=[None]*Max
    def encolar(self,D):
        self.fin+=1
        if self.fin==len(self.Datos):
            self.fin=0
        self.Datos[self.fin]=D
        if self.inicio==0:
            self.inicio=1

    def desencolar(self):
        d=self.Datos[self.inicio]
        if self.inicio==self.fin:
            self.inicio=self.fin=-1
        else:
            self.inicio+=1
        return d
    def colallena(self):
        return (self.inicio==0 and self.fin==len(self.Datos)) or self.inicio==self.fin+1
    def colavacia(self):
        return self.inicio==self.fin
    


maxi=int(input("introduce el maximo de datos: "))
cola1 = cola(maxi)
ops=0
while not ops==3:
    print("1.- agregar dato")
    print("2.- borrar dato")
    print("3.- mostrar datos")
    ops=int(input(""))
    match ops:
        case 1:
            cola1.encolar(input("escribe el dato a agregar"))
        case 2:
            cola1.desencolar()
        case 3:
            print()