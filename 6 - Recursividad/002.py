'''
Crea una función recursiva que calcule el valor de la serie de Fibonacci en la posición
indicada. Posteriormente, muestra la serie completa hasta la posición que el usuario
especifique.
'''


def fibonacci(pos):
    if pos == 0:
        return 0
    elif pos == 1:
        return 1
    else:
        return fibonacci(pos - 1) + fibonacci(pos - 2)
    

def mostrar_fibonacci(num_pos):
    for i in range(0, num_pos + 1):
        print(fibonacci(i))
            

mostrar_fibonacci(8)