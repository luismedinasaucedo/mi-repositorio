# definiciones y argumentos
def saludo(nombre):
    print("hola ",nombre)


saludo("juan")
print("-------------------")
# valores de retorno
def suma(a,b):
    return a+b
print(suma(3,4))
cuadrado=lambda x:x**2
print(cuadrado(5))
print("-------------------")
#alcance de las variables local y global

def funcion():
    variable_local=10
    print(variable_local)#accesible dentro de la funcion

variable_global=20

def funcion2():
    print(variable_global)#accesible desde cualquier lugar 

funcion()
funcion2()
print(variable_global)
#print(variable_local) daria error debido a que no esta definida en este alcance
print("-------------------")
#funciones definidas por el usuario
def cal_media(*numeros):
    suma=sum(numeros)
    cantidad=len(numeros)
    media=sum(numeros)/len(numeros)
    return print(media)

cal_media(10,20,30,40)
print("-------------------")
#Es una buena práctica documentar nuestras funciones utilizando docstrings. Los docstrings son cadenas de texto que describen el propósito, los parámetros y el valor de retorno de una función.
# Se colocan inmediatamente después de la definición de la función y se encierran entre triples comillas dobles.
def area_rectangulo(base, altura):
    """
    Calcula el área de un rectángulo.


    Args:
        base (float): La base del rectángulo.
        altura (float): La altura del rectángulo.


    Returns:
        float: El área del rectángulo.
    """
    return base * altura
def sumav(*numeros):
    total=0
    for numero in numeros:
        total+=numero
    return total
print(sumav(1, 2, 3))  # Imprime 6