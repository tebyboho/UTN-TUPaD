'''
Implementá una función recursiva llamada es_palindromo(palabra) que reciba una cadena de texto sin espacios ni tildes, y devuelva True si es un palíndromo o False si no lo es.
Requisitos:
La solución debe ser recursiva. No se debe usar [::-1] ni la función reversed().
'''



def es_palindromo(palabra):
    
    if len(palabra) == 0 or len(palabra) == 1:
        return True
    elif palabra[0] == palabra[-1]:
        return es_palindromo(palabra[1:-1])
    else:
        return False
        
print(es_palindromo("neuquen"))