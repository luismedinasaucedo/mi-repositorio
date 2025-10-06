lista=["luis","carlo","medina"]
print(lista[0])
print(lista[len(lista)-1])
print(lista[len(lista)//2])
lista.insert(3,"saucedo")
print(lista)
lista[1]=lista[1].upper()
print(lista[1])
"#; lista"
print(lista.__contains__("luis"))
print("luis" in lista)
print(lista[1:4])
del lista[0]
print(lista)

front_end = ['HTML', 'CSS', 'JS', 'React', 'Redux']
back_end = ['Node','Express', 'MongoDB']
full_stack= front_end+["python","SQL"]+back_end
#full_stack.insert(full_stack.index('Redux')+1,"python")

#full_stack[full_stack.index('Redux'):full_stack.index('Redux')] = ['Python', 'SQL']
print(full_stack)
