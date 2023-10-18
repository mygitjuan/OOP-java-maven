package com.DXC.MyShoppingCart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicioShoppingCartTest {

    @Test
    void estaVacioCarritoTieneCeroArticulos() throws ProductNotFoundException {

        ShoppingCart carrito = new ShoppingCart();
        Product producto = new Product("Pepsi", 3.50);
        carrito.addItem(producto);

        carrito.removeItem(producto);

        int carritoItems = carrito.getItemCount();

        assertEquals(0, carritoItems);


    }

    @Test
    void agregaNuevoProductoCantidadArticulosDebeSerIncrementado() throws ProductNotFoundException {
        int carritoItems = 0;

        ShoppingCart carrito = new ShoppingCart();
        Product producto = new Product("Pepsi", 3.50);
        carrito.addItem(producto);

        carritoItems = carrito.getItemCount();
        assertEquals(1, carritoItems);

        Product producto_comida = new Product("Pizza", 4.00);
        carrito.addItem(producto_comida);

        carritoItems = carrito.getItemCount();
        assertEquals(2, carritoItems);

        Product producto_postre = new Product("Helado", 1.50);
        carrito.addItem(producto_postre);

        carritoItems = carrito.getItemCount();
        assertEquals(3, carritoItems);

    }
    @Test
    void agregaNuevoProductoNuevoSaldoEsSumaSaldos() throws ProductNotFoundException {

        ShoppingCart carrito = new ShoppingCart();
        double precio = 0;
        double saldo = 0;
        double saldoCarrito = 0;

        precio = 3.50;
        Product producto_bebida = new Product("Pepsi", precio );
        carrito.addItem(producto_bebida);
        saldo = saldo + precio;

        precio = 4.00;
        Product producto_comida = new Product("Pizza", precio);
        carrito.addItem(producto_comida);
        saldo = saldo + precio;

        precio = 1.50;
        Product producto_postre = new Product("Helado", precio);
        carrito.addItem(producto_postre);
        saldo = saldo + precio;

        saldoCarrito = carrito.getBalance();

        System.out.println("Saldo total  : " + saldo);
        System.out.println("Saldo carrito: " + saldoCarrito);

        assertEquals(saldo, saldoCarrito);


    }

    @Test
    void eliminaUnElementoDisminuyeNumeroElementos() throws ProductNotFoundException {

        int carritoItems = 0;

        ShoppingCart carrito = new ShoppingCart();
        Product producto = new Product("Pepsi", 3.50);
        carrito.addItem(producto);

        carritoItems = carrito.getItemCount();
        assertEquals(1, carritoItems);

        Product producto_comida = new Product("Pizza", 4.00);
        carrito.addItem(producto_comida);

        carritoItems = carrito.getItemCount();
        assertEquals(2, carritoItems);

        Product producto_postre = new Product("Helado", 1.50);
        carrito.addItem(producto_postre);

        carritoItems = carrito.getItemCount();
        assertEquals(3, carritoItems);

        carrito.removeItem(producto_comida);
        carritoItems = carrito.getItemCount();
        assertEquals(2, carritoItems);

    }

    void retiraProductoNoEstaEnCarritoLanzaProductoNotFoundException() throws ProductNotFoundException {

        ShoppingCart carrito = new ShoppingCart();

        Product producto = new Product("Pepsi", 3.50);
        carrito.addItem(producto);

        Product producto_comida = new Product("Pizza", 4.00);
        carrito.addItem(producto_comida);

        Product producto_postre = new Product("Helado", 1.50);
        carrito.addItem(producto_postre);

        assertThrows(ProductNotFoundException.class, ()  -> {
            carrito.removeItem(producto_postre);
        });


    }

}
