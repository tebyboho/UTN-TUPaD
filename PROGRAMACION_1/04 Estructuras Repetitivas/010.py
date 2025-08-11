'''
10) Escribe un programa que invierta el orden de los dígitos de un número ingresado por el
usuario. Ejemplo: si el usuario ingresa 547, el programa debe mostrar 745.
Se puede hacer usando slicing
'''


numero = int(input("Ingrese un número entero: "))
numero_invertido = 0

while numero != 0:
    digito = numero % 10  # Tomo el último dígito
    numero_invertido = numero_invertido * 10 + digito  # Lo sumo al nuevo número
    numero = numero // 10  # Le saco el último dígito

print("Número invertido:", numero_invertido)
