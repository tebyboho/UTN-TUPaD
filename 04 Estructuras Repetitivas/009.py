'''
9) Elabora un programa que permita al usuario ingresar 100 números enteros y luego calcule la
media de esos valores. (Nota: puedes probar el programa con una cantidad menor, pero debe
poder procesar 100 números cambiando solo un valor).
'''

CANTIDAD = 5  

contador = 0
suma = 0

while contador < CANTIDAD:
    numero = int(input(f"Ingrese el número {contador + 1}: "))
    suma += numero
    contador += 1

media = suma / CANTIDAD

print("\n--- Resultado ---")
print("La media de los números ingresados es:", media)
