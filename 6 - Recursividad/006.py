'''
Escribí una función recursiva en Python llamada suma_digitos(n) que reciba un número entero positivo y devuelva la suma de todos sus dígitos.
Restricciones:
No se puede convertir el número a string.
Usá operaciones matemáticas (%, //) y recursión.
'''

def suma_digitos(num):
    if num < 10:
        return num
    else:
        return (num % 10) + suma_digitos(num // 10)


print(suma_digitos(12345))