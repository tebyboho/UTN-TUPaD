'''
7) Dado dos sets de números, representando dos listas de estudiantes que aprobaron Parcial 1
y Parcial 2:
• Mostrá los que aprobaron ambos parciales.
• Mostrá los que aprobaron solo uno de los dos.
• Mostrá la lista total de estudiantes que aprobaron al menos un parcial (sin repetir).


CONSIGNA CONFUSA, DONDE ESTAN LOS SETS DE NUMEROS ?
'''


parcial1 = {"ana", "juan", "marcos", "lucia"}
parcial2 = {"marcos", "lucia", "sofia", "pedro"}


ambos = parcial1 & parcial2
print("Aprobó ambos parciales:", ambos)


solo_uno = parcial1 ^ parcial2  
print("Aprobó solo uno:", solo_uno)


al_menos_uno = parcial1 | parcial2
print("Aprobó al menos un parcial:", al_menos_uno)