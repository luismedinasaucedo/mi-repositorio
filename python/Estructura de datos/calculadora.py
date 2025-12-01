import math
l=10 
s=4
m=3

suma=0

for i in range(s-1):
    suma=((l/m)/(math.factorial(i)))+suma

CargaOfrecida=l/m

p=l/(s*m)
pw=(1/math.factorial(s))((l/m)**s)((s*m)/(s*m)-l)#falta p0
#Lq=
#Wq=
#L=
#Pn=