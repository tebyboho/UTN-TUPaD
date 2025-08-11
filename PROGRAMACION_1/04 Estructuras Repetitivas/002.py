'''
2) Desarrolla un programa que solicite al usuario un número entero y determine la cantidad de
dígitos que contiene.
'''

numero = int(input("Ingrese un numero entero: "))

contador = 0

if numero == 0:
    contador = 1
else:
    while numero > 0:
        numero //= 10
        contador += 1

print("Cantidad de dígitos:", contador)
