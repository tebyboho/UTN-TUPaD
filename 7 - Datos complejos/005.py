'''
5) Solicita al usuario una frase e imprime:
• Las palabras únicas (usando un set).
• Un diccionario con la cantidad de veces que aparece cada palabra.
'''


frase = input("Ingresá una frase: ")

palabras = frase.lower().split()

palabras_unicas = set(palabras)

print("\nPalabras únicas:")
print(palabras_unicas)


recuento = {}
for palabra in palabras:
    recuento[palabra] = recuento.get(palabra, 0) + 1

print("\nFrecuencia de palabras:")
print(recuento)
