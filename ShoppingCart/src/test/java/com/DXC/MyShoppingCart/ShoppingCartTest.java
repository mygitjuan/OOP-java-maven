package com.DXC.MyShoppingCart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void seCreaCarritoTieneCeroArticulos() {

        ShoppingCart carrito = new ShoppingCart();

        int carritoItems = carrito.getItemCount();

        assertEquals(0, carritoItems);


    }




}