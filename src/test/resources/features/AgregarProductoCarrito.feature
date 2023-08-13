#language:es
Característica: : Agregar producto a carrito de compras en pagina de Alkomprar
  yo como usuario quiero seleccionar un producto de la pagina de alkomprar y
  poder agregarlo al carrito de compras.

  @AgregarProductoCarrito
  Escenario: Agregar producto a carrito de compras exitosamente.
    Dado que el usuario abre la pagina alkomprar
    Cuando cuando el usuario busque un producto en el buscador
    Y seleccione un producto aleatoriamente de la lista de productos
    Y pulse en el botón de agregar al carrito
    Entonces el usuario podra ver un mensaje del producto agregado exitosamente al carrito.