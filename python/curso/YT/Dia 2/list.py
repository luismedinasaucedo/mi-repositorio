#listas
my_list=list()
my_other_list=["luis","Medina",21,172]
print(my_other_list)
#unpacking
nombre,apellido,edad,estatura=my_other_list
print(nombre)

my_other_list.append("tec")#añadir al final
print(my_other_list)
my_other_list.insert(1,"3ero")#anadir al punto que queremos
print(my_other_list)
my_other_list.remove("3ero")
print(my_other_list)#remueve el primer elemento con el atrivuto que buscas
print(my_other_list.pop())#elimina un dato entre parentesis se anade el numero del indice
print(my_other_list)
