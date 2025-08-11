'''
4) Elabora un programa que permita al usuario ingresar números enteros y los sume en
secuencia. El programa debe detenerse y mostrar el total acumulado cuando el usuario ingrese
un 0.
'''

num = int(input("Ingrese un número: "))
sumador = 0

while num != 0:
    sumador += num
    print("Total parcial:", sumador)
    num = int(input("Ingrese un número: "))  

print("Total acumulado:", sumador)
