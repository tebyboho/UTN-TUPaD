'''
1) Escribir un programa que solicite la edad del usuario. Si el usuario es mayor de 18 años,
deberá mostrar un mensaje en pantalla que diga “Es mayor de edad”.
'''

edad = int(input("Ingresa tu edad: "))

if edad >= 18:
    print("Sos mayor de edad")
else:
    print("No sos mayor de edad, lo siento :( )")