'''
3) Escribe un programa que sume todos los números enteros comprendidos entre dos valores
dados por el usuario, excluyendo esos dos valores.
'''

limite_1 = int(input("Ingrese el primer limite: "))
limite_2 = int(input("Ingrese el segundo limite: "))


for i in range(limite_1 + 1, limite_2):
    print(i)