#Un diccionario es una estructura de datos mutable y no ordenada que permite almacenar pares de clave-valor. Cada elemento en un diccionario consiste en una clave única y su valor 
# correspondiente. Los diccionarios se encierran entre llaves {}, y los pares clave-valor se separan por comas.

#Para crear un diccionario, utiliza llaves y separa las claves y valores con dos puntos.
persona={"nombre":"juan","edad":"22","ciudad":"madrid"}
#print(persona["nombre"])
#print(persona.get("edad"))#se puede llamar con un get
#print(persona.keys())#imprime las claves del diccionario
#print(persona.values())#imprime los valores
#print(persona.items())#devuelve clave-valor
persona.update({"profecion":"ingeniero"})#agrega clave-valor
print(persona)

