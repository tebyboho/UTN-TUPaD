'''
6) consigna muy larga, buscar en el pdf..
'''

import random
from statistics import mode, median, mean

lista_numeros = [random.randint(1, 100) for i in range(100)]

moda = mode(lista_numeros)
mediana = median(lista_numeros)
media = mean(lista_numeros)

print( '\n',moda,'\n' ,mediana,'\n',media,'\n')
# Sesgo positivo o a la derecha:
if media > mediana and mediana > moda:
    print("Sesgo positivo")
# Sesgo negativo o a la izquierda
elif media < mediana and mediana < moda:
    print("Sesgo negativo")
# Sin cesgo
elif media == mediana and mediana == moda:
    print("Sin cesgo")
else:
    print("Error..")