'''
5. Crear una función llamada segundos_a_horas(segundos) que reciba
una cantidad de segundos como parámetro y devuelva la cantidad
de horas correspondientes. Solicitar al usuario los segundos y mos-
trar el resultado usando esta función.
'''

def segundos_a_horas(cant_seg):
    cant_horas = cant_seg / 3600
    return cant_horas
    
cant_segundos = float(input("Ingresa la cantidad de segundos: "))

print(f'{cant_segundos} segundos equivalen a {segundos_a_horas(cant_segundos)} horas')