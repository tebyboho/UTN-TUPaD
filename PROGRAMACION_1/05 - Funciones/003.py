'''
3. Crear una función llamada informacion_personal(nombre, apellido,
edad, residencia) que reciba cuatro parámetros e imprima: “Soy
[nombre] [apellido], tengo [edad] años y vivo en [residencia]”. Pe-
dir los datos al usuario y llamar a esta función con los valores in-
gresados.
'''


def informacion_personal(nombre, apellido, edad, residencia):
    print(f'Hola soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}.')
    
    
nombre = str(input("Ingresa tu nombre: "))
apellido = str(input("Ingresa tu apellido: "))
edad = int(input("Ingresa tu edad: "))
residencia = str(input("Ingresa tu residencia: "))

informacion_personal(nombre, apellido, edad, residencia)