import random
def llenar(arreglo):
    for i in range (100):
        arreglo[i]=random.randint(1,1000)

def mostrar(arreglo):
    for i in range (100):
        print(arreglo[i])

def burbuja(arreglo,bol):
    bol=False
    for i in range(0,len(arreglo)-1):
        if i==len(arreglo)-1:
            break
        if arreglo[i]>arreglo[i+1]:
            arreglo[i],arreglo[i+1]=arreglo[i+1],arreglo[i]
            bol=True
    if bol:
        burbuja(arreglo,bol)

arreglo = [None]*100
llenar(arreglo)
mostrar(arreglo)
print("\n")
burbuja(arreglo,False)
mostrar(arreglo,)
