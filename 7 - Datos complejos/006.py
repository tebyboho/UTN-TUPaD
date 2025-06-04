'''
6) Permití ingresar los nombres de 3 alumnos, y para cada uno una tupla de 3 notas.
Luego, mostrá el promedio de cada alumno.
'''

import os

#Funcion para limpiar la pantalla
def limpiar_pantalla():
    os.system('cls' if os.name == 'nt' else 'clear')

alumnos = {}

for i in range(3):
    nombre = input("Ingresa el nombre del alumno: ").lower()
    notas = []
    for j in range(3):
        nota = float(input(f"Ingresa las notas para {nombre.title()}: "))
        notas.append(nota)
    limpiar_pantalla()
    alumnos[nombre] = tuple(notas)


# Mostramos el resultado
print("\nNotas de los alumnos:")
for nombre, notas in alumnos.items():
    promedio = sum(notas) / len(notas)
    print(f"{nombre.capitalize()}: Notas = {notas}, Promedio = {promedio:.2f}")
    