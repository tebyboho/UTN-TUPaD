'''
7. Crear una función llamada operaciones_basicas(a, b) que reciba
dos números como parámetros y devuelva una tupla con el resulta-
do de sumarlos, restarlos, multiplicarlos y dividirlos. Mostrar los re-
sultados de forma clara.
'''


def operaciones_basicas(a, b):
    print(f'{a + b}')
    print(f'{a - b}')
    print(f'{a * b}')
    print(f'{a / b}')

a = int(input('Ingresa un primer numero entero positivo: '))
b = int(input('Ingresa un segundo numero entero positivo: '))

operaciones_basicas(a, b)