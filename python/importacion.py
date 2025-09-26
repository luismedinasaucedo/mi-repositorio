import math

resultado=math.sqrt(25)
print(resultado)
#tambien se puede extraer solo una funcion del modulo usando from math import sqrt

import random
import datetime

numero_aleatorio=random.randint(1,10)
fecha_actual=datetime.datetime.now()
print(fecha_actual)
print("------------------------------")
#creacion de modulos propios
import mi_modulo
mi_modulo.saludar("juan")
resultado = mi_modulo.sumar(5, 3)
print(resultado)  # Imprime 8