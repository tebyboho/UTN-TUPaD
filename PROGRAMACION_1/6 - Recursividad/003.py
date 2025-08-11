'''
Crea una función recursiva que calcule la potencia de un número base elevado a un
exponente, utilizando la fórmula n^m = n * n ^(m-1) . Prueba esta función en un algoritmo general.
'''


def potencia(base, exp):
    if exp == 0: # Todo numero elevado a la 0, es = 1
        return 1
    else:
        return  base * potencia(base, exp - 1)
    
    

print(potencia(2, 4))