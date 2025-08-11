'''
5) Crea un juego en el que el usuario deba adivinar un número aleatorio entre 0 y 9. Al final, el
programa debe mostrar cuántos intentos fueron necesarios para acertar el número.
Aclaración propia: se deberia de implementar logica para manejar negativos..
'''
import random

num_aleatorio = random.randint(0, 9)

num_user = int(input("Intenta adivinar el numero: "))
intentos = 0

while num_user != num_aleatorio:
    num_user = int(input("Intenta de nuevo.. "))
    intentos += 1

print(f"Acertaste !!  Te llevo {intentos} intento/s")