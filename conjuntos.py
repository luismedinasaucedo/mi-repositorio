#Un conjunto es una estructura de datos mutable y no ordenada que permite almacenar una colección de elementos únicos. 
#Los conjuntos se encierran entre llaves {} o se crean utilizando la función set().

conjunto1={1,2,3}
conjunto2={3,5,6}
union=conjunto1|conjunto2
interceccion=conjunto1&conjunto2
print(union)
print(interceccion)
diferencia=conjunto1-conjunto2
print(diferencia)
diferenciasimetrica=conjunto1^conjunto2
print(diferenciasimetrica)