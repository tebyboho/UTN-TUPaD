'''
10) Dado un diccionario que mapea nombres de países con sus capitales, construí un nuevo diccionario donde:
• Las capitales sean las claves.
• Los países sean los valores.
'''


paises = {
    "argentina": "buenos aires",
    "chile": "santiago",
    "uruguay": "montevideo"
}

capitales = {} # se puede usar un for comprehension
for pais, capital in paises.items():
    capitales[capital] = pais

print("Diccionario original:", paises)
print("Diccionario invertido:", capitales)







