class Pila:
    
    def __init__(self,Max:int):
        self.Max=Max
        self.Tope=-1
        self.PilaInicial=[None]*Max 

    def pull(self):
            return self.PilaInicial[self.Tope]
    def Push(self,D):
            self.Tope+=1
            self.PilaInicial[self.Tope]=D
    def pop(self):
            temp=self.Tope
            self.Tope-=1
            return self.PilaInicial[temp]
    def PilaLlena(self):
            return self.Tope==self.Max-1
    def PIlaVacia(self):
            return self.Tope==-1
    def mostrar(self):
        if self.PIlaVacia():
                print("la torre esta vacia")
                return
        for i in range(self.Tope,-1,-1):
                print(self.PilaInicial[i])
def mover(O:Pila,D:Pila):
              D.Push(O.pop())
        
def seleccionarpila(A:Pila,B:Pila,C:Pila,K):
       match K:
              case "A":
                     return A
              case "B":
                     return B
              case "C":
                     return C
Top=int(input("Escribe la cantidad de Discos: "))
PilaA=Pila(Top)
PilaB=Pila(Top)
PilaC=Pila(Top)
for e in range(Top,0,-1):
    PilaA.Push(e)

while not PilaC.PilaLlena():
        print("pila A")
        PilaA.mostrar()
        print("pila B")
        PilaB.mostrar()
        print("pila C")
        PilaC.mostrar()
        O=seleccionarpila(PilaA,PilaB,PilaC,input("selecciona la pila de origen: "))
        D=seleccionarpila(PilaA,PilaB,PilaC,input("selecciona la pila de destino: "))
        mover(O,D)
print("Ganaste")
PilaC.mostrar()
                                       
