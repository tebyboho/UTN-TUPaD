'''
2. Crear una función llamada saludar_usuario(nombre) que reciba
como parámetro un nombre y devuelva un saludo personalizado.
Por ejemplo, si se llama con saludar_usuario("Marcos"), deberá de-
volver: “Hola Marcos!”. Llamar a esta función desde el programa
principal solicitando el nombre al usuario.
'''
nombre_usuario = str(input("Ingresa tu nombre: "))

def saludar_usuario(nombre_usuario):
    print(f'Hola {nombre_usuario} !!')


saludar_usuario(nombre_usuario)