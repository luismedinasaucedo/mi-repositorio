class Pila:
    def __init__(self,Max:int):
        self.Max=Max
        self.Tope=-1
        self.PilaInicial=[None]*Max
    def pull(self):
        return self.PilaInicial[self.Tope]
    def push(self,D):
        self.Tope+=1
        self.PilaInicial[self.Tope]=D
    def pop(self):
        tem=self.Tope
        self.Tope-=1
        return self.PilaInicial[tem]
    def pilallena(self):
        return self.Tope==self.Max-1
    def pilavacia(self):
        return self.Tope==-1
    def mostrar(self):
        if self.pilavacia():
                print("la torre esta vacia")
                return
        for i in range(self.Tope,-1,-1):
                print(self.PilaInicial[i])
def mover(O:Pila,D:Pila):
              D.push(O.pop())

operacion=input("escribe la operacion que quieras poner en postorden: ")
PilaA=Pila(len(operacion))
PilaB=Pila(len(operacion))
PilaC=Pila(len(operacion))
for i in operacion:
      PilaA.push(i)
#PilaA.mostrar()
while not PilaC.pilallena():
      mover(PilaA,PilaC)
#PilaC.mostrar()

def postorden(a:Pila,b:Pila,c:Pila):
      contador=0
      par=0
      while a.pilallena()==False:
            if c.pull() in "()":
                  #print("3")
                  c.pop()
                  par+=1
            elif c.pull() in "+-*/":##si es un operador
                  #print("1")
                  b.push(c.pop())
            elif c.pull() in "123456789":# si es un numero
                  #print("2")
                  a.push(c.pop())
            
            elif contador==1 and par<2:
                  #print("4")
                  mover(b,a)
                  contador=0
            if par==4:
                  #print("5")
                  mover(b,a)
                  par=0
            if c.pilavacia():
                  #print("6")
                  mover(b,a)
            if c.pilavacia() and b.pilavacia():
                  #print("7")
                  a.push("")
            
            
postorden(PilaA,PilaB,PilaC)#(4+5)/(3-2)
PilaA.mostrar()