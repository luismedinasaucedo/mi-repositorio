import random;
def partir(arreglo,inicio,fin):
    i=inicio-1
    pivote=arreglo[fin]
    for j in range(inicio,fin):
        if arreglo[j]<=pivote:
            i+=1
            temporal=arreglo[i]
            arreglo[i]=arreglo[j]
            arreglo[j]=temporal
    arreglo[i+1],arreglo[fin]=arreglo[fin],arreglo[i+1]
    return i+1

def quicksort(arreglo,inicio,fin):
    if inicio<fin:
        mostrar(arreglo)
        indice = partir(arreglo,inicio,fin)
        quicksort(arreglo,inicio,indice-1)
        quicksort(arreglo,indice+1,fin)

def llenar(arreglo):
    for i in range (len(arreglo)):
        arreglo[i]=random.randint(1,100)

def mostrar(arreglo):
    for i in range (len(arreglo)):
        print(i,"-"+"|"*arreglo[i])

arreglo = [None]*30
llenar(arreglo)
#mostrar(arreglo)

quicksort(arreglo,0,len(arreglo)-1)
print("\n")
mostrar(arreglo)