import random
def llenar(arreglo):
    for i in range (100):
        arreglo[i]=random.randint(1,190)

def mostrar(arreglo):
    for i in range (100):
        print("-"*arreglo[i])

def insercion(arreglo):
    for i in range (100):
        j=i-1
        temp=arreglo[i]
        while j>-1 and arreglo[j]>temp:
                arreglo[j+1]=arreglo[j]
                j-=1
        arreglo[j+1]=temp

                

arreglo = [None]*100
llenar(arreglo)
mostrar(arreglo)
print("\n")
insercion(arreglo)
mostrar(arreglo)