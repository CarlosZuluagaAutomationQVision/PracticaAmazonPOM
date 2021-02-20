#language: es
#cazuluagago@gmail.com

Característica: Proceso de agregar producto al carrito de compras en la tienda de Amazon.
  Como usuario de amazon en el rol de comprador
  Quiero buscar y agregar al carrito de compras el producto deseado
  Para garantizar que el producto a comprar corresponde al producto seleccionado

  Escenario: Buscar y agregar al carrito de compras el producto deseado
    Dado que deseo comprar el producto 'S.H. Figuarts Piccolo' desde Amazon
    Cuando seleccione el producto apropiado en los resultados de la búsqueda
    Y lo agregue al carrito de compras
    Entonces observo que el producto en el carrito de compras corresponde al producto seleccionado