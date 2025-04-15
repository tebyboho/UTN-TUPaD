'''
8. Crear una función llamada calcular_imc(peso, altura) que reciba el
peso en kilogramos y la altura en metros, y devuelva el índice de
masa corporal (IMC). Solicitar al usuario los datos y llamar a la fun-
ción para mostrar el resultado con dos decimales.
'''

def calcular_imc(peso, altura):
    resultado = peso / (altura** 2)
    return resultado

peso = float(input("Ingresa tu peso en kg: "))
altura = float(input("Ingresa tu altura en metros: "))

print(f"Tu IMC es de: {calcular_imc(peso, altura)}")