str_multilinea='''esto es un str en varias
lineas no se en que puede ser util pero 
aqui esta'''
print(str_multilinea)
string="\"Hello word\""
print(string)

print("Day 1\t5\t5")
nombre="Luis"
apellido="Medina"
edad=21

formanorecomendada="Mi nombre es "+nombre+" "+apellido+" tengo "+str(edad)
mejorforma=f"Mi nombre es {nombre} {apellido} tengo {edad}"
formamoderna="Mi nombre es {} {} tengo {}".format(nombre,apellido,edad)#forma introducida en python 3
formaantigua="Mi nombre es %s %s tengo %d"%(nombre,apellido,edad)#forma basica %s para str, %d para enteros, %f para floats, %.number of digitsf para floats con x cantidad de numeros
print(formanorecomendada)
print(formamoderna)
print(formaantigua)
print(mejorforma)

python_libraries = ['Django', 'Flask', 'NumPy', 'Matplotlib','Pandas']
formated_string = 'The following are python libraries:%s' % (python_libraries)
print(formated_string) 
print(python_libraries) 

#desenpaquetado
idioma="python"
a,b,c,d,e,f=idioma
print(a)
print(b)
primeraletra=idioma[1]
print(primeraletra)
ultimaletra=idioma[len(idioma)-1]
print(ultimaletra)
print("----------------------------------")
#division
idiomadiv=idioma[1:3]
print(idiomadiv)
#reversa
print(idioma[::-1])

#funciones
print(idioma.capitalize())
print(idioma.upper())
print(idioma.count("t"))
print(idioma.isnumeric())
print("1".isnumeric())
print(idioma.upper().isupper())