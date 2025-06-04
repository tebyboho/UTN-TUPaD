'''
4) Escribí un programa que permita almacenar y consultar números telefónicos. 
• Permití al usuario cargar 5 contactos con su nombre como clave y número como valor.
• Luego, pedí un nombre y mostrale el número asociado, si existe.
'''

import os

#Funcion para limpiar la pantalla
def limpiar_pantalla():
    os.system('cls' if os.name == 'nt' else 'clear')

agenda = {}

for i in range(5):
    nombre = input("Ingresa el nombre del contacto a cargar: ").lower()
    numero = input("\nIngresa el numero de telefono a cargar: ")
    limpiar_pantalla()
    
    agenda[nombre] = numero


print(agenda)

nombre_consulta = input("Ingresa el nombre a consultar: \n").lower()

if nombre_consulta in agenda.keys():
    print(agenda[nombre_consulta])
else:
    print("Ese nombre no esta cargado..")