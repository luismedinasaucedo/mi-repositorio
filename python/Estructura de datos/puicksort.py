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
        indice = partir(arreglo,inicio,fin)
        mostrar(arreglo)
        quicksort(arreglo,inicio,indice-1)
        quicksort(arreglo,indice+1,fin)

def llenar(arreglo):
    for i in range (100):
        arreglo[i]=random.randint(1,190)

def mostrar(arreglo):
    for i in range (100):
        print(i,"-"+"|"*arreglo[i])

arreglo = [None]*100
llenar(arreglo)
mostrar(arreglo)

quicksort(arreglo,0,99)
print("\n")
mostrar(arreglo)