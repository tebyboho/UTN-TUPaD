'''
4. Crear dos funciones: calcular_area_circulo(radio) que reciba el ra-
dio como parámetro y devuelva el área del círculo. calcular_peri-
metro_circulo(radio) que reciba el radio como parámetro y devuel-
va el perímetro del círculo. Solicitar el radio al usuario y llamar am-
bas funciones para mostrar los resultados.
'''


def calcular_area_circulo(radio):
    total = (radio** 2) * 3.14
    
    return total

def calcular_perimetro_circulo(radio):
    total = (radio * 2) * 3.14
    return total

radio = float(input("Ingresa el radio del circulo: "))

print(f"El perimetro es de {calcular_perimetro_circulo(radio)} y el area es de {calcular_area_circulo(radio)}")






