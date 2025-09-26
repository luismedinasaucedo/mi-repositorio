def mcd (num1,num2):
    if num1==0:
        return num2
    if num2==0:
        return num1
    if num1>=num2:
        return mcd(num1-num2,num2)
    if num2>=num1:
        return mcd(num1,num2-num1)
print(mcd(18,24))