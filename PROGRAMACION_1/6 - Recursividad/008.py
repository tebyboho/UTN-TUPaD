'''
Escribí una función recursiva llamada contar_digito(numero, digito) que reciba un número entero positivo (numero) y un dígito (entre 0 y 9), y devuelva cuántas veces aparece ese dígito dentro del número.
'''


def contar_digito(numero, digito):
    if numero == 0:
        return 0
    
    ultimo_digito = numero % 10
    contador = 0
    
    if ultimo_digito == digito:
        contador = 1
    else:
        contador = 0
    resultado_resto = contar_digito(numero // 10, digito)
    
    return contador + resultado_resto

    
print(contar_digito(1123411, 1))