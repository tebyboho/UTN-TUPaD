'''
10.Crear una función llamada calcular_promedio(a, b, c) que reciba
tres números como parámetros y devuelva el promedio de ellos.
Solicitar los números al usuario y mostrar el resultado usando esta
función.
'''






def calcular_promedio(a, b, c):
    promedio = (a + b + c) / 3
    return promedio


a = float(input("Ingrea el primer numero: "))
b = float(input("Ingrea el segundo numero: "))
c = float(input("Ingrea el tercer numero: "))

print(f'El promedio entre {a, b, c} es de {calcular_promedio(a,b,c)}')


