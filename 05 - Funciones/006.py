'''
6. Crear una función llamada tabla_multiplicar(numero) que reciba un
número como parámetro y imprima la tabla de multiplicar de ese
número del 1 al 10. Pedir al usuario el número y llamar a la fun-
ción.
'''

def tabla_multiplicar(numero):
    for num in range(1,11):
        print(f'{numero} x {num} = {numero * num}')
        

numero = int(input("Ingresa un numero positivo entero: "))

tabla_multiplicar(numero)