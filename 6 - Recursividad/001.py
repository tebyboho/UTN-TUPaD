'''
Crea una función recursiva que calcule el factorial de un número. Luego, utiliza esa
función para calcular y mostrar en pantalla el factorial de todos los números enteros
entre 1 y el número que indique el usuario
'''



def factorial_recursivo(num):
    if num == 1:
        return 1
    else:
        return num * factorial_recursivo(num - 1)
    


def todos_los_factoriales(num):
    if num > 1 :
        for i in range(1, num + 1):
            print(factorial_recursivo(i))
    else:
        print(f'{num} no es mayor a 1..')
        
        
print(todos_los_factoriales(4))