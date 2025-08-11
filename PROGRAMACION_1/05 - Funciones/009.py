'''
9. Crear una función llamada celsius_a_fahrenheit(celsius) que reciba
una temperatura en grados Celsius y devuelva su equivalente en
Fahrenheit. Pedir al usuario la temperatura en Celsius y mostrar el
resultado usando la función.
'''



def celsius_a_fahrenheit(celsius):
    total_farenheit = (celsius * (9/5)) + 32
    return total_farenheit


grados_celsius = float(input("Ingresa los grados celsius a convertir: "))

print(f'{grados_celsius} grados celsius equivalen a {celsius_a_fahrenheit(grados_celsius)} grados farenheit.')