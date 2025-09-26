def interes(mes,dinero):
    if mes==0:
        return print(f"su dinero es {dinero}")

    interes(mes-1,dinero*1.05)
interes(5,3000)