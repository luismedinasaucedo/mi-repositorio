#lectura de archvos se hace en modo r utilizando el meetodo read(), readline() o readlines()
archivo = open("datos.txt", "r")
contenido = archivo.readline()
print(contenido)
archivo.close()

archivo = open("datos.txt", "w")
archivo.write("hola mundo")
archivo.close