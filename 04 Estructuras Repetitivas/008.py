'''
8) Escribe un programa que permita al usuario ingresar 100 números enteros. Luego, el
programa debe indicar cuántos de estos números son pares, cuántos son impares, cuántos son
negativos y cuántos son positivos. (Nota: para probar el programa puedes usar una cantidad
menor, pero debe estar preparado para procesar 100 números con un solo cambio).
'''

CANTIDAD = 5

contador = 0
pares = 0
impares = 0
positivos = 0
negativos = 0

while contador < CANTIDAD:
    numero = int(input(f"Ingrésá el número {contador + 1}: "))
    
    # Par o impar
    if numero % 2 == 0:
        pares += 1
    else:
        impares += 1

    # Positivo o negativo
    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1

    contador += 1

# Resultados
print("\n--- Resultados ---")
print("Pares:", pares)
print("Impares:", impares)
print("Positivos:", positivos)
print("Negativos:", negativos)
