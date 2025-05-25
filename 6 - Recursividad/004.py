'''
Crear una función recursiva en Python que reciba un número entero positivo en base
decimal y devuelva su representación en binario como una cadena de texto.
'''


def binario_a_decimal(n):
    if n ==  0 :
        return ''
    else:
        return binario_a_decimal(n // 2) + str(n % 2)

print(binario_a_decimal(10))