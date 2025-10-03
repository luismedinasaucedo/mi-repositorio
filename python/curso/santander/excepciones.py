try:
    resultado=10/0
except ZeroDivisionError:
    print("divicion por 0")
except ValueError:
    print("error de valor")
print("----------------------------------------------")
def funcion():
    resultado=100
    if resultado==100:
        raise Exception("resultado incorrecto")


try:
    funcion()
except Exception as e:
    print(f"Error: {str(e)}")
