'''
8) Armá un diccionario donde las claves sean nombres de productos y los valores su stock.
Permití al usuario:
• Consultar el stock de un producto ingresado.
• Agregar unidades al stock si el producto ya existe.
• Agregar un nuevo producto si no existe.
'''


stock = {
    "pan": 10,
    "leche": 5,
    "huevos": 1
}

producto = input("Ingresá el nombre del producto: ").lower()

if producto in stock:
    print(f"Stock actual de {producto}: {stock[producto]} {'unidad' if stock[producto] == 1 else 'unidades'}")
    agregar = input("¿Querés agregar unidades? (s/n): ").lower()
    if agregar == "s":
        cantidad = int(input("¿Cuántas unidades querés agregar?: "))
        stock[producto] += cantidad
        print(f"Nuevo stock de {producto}: {stock[producto]} {'unidad' if stock[producto] == 1 else 'unidades'}")
else:
    agregar_nuevo = input(f"{producto} no está en stock. ¿Querés agregarlo? (s/n): ").lower()
    if agregar_nuevo == "s":
        cantidad = int(input("¿Cuántas unidades querés agregar?: "))
        stock[producto] = cantidad
        print(f"{producto} agregado al stock con {cantidad} {'unidad' if stock[producto] == 1 else 'unidades'}")
