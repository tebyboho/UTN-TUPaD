'''
7) Escribir un programa que solicite una frase o palabra al usuario. Si el string ingresado
termina con vocal, añadir un signo de exclamación al final e imprimir el string resultante por
pantalla; en caso contrario, dejar el string tal cual lo ingresó el usuario e imprimirlo por
pantalla.
'''

cadena = str(input("Ingresa una frase o palabra: "))

vocales = ['a', 'e', 'i', 'o', 'u'] # se podria haber usado un diccionario tambien

if cadena[-1:].lower() in vocales:
    print(f"{cadena}!") # se puede usar el metodo append tambien 
else:
    print(f"{cadena}")