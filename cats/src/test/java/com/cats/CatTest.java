package com.cats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void getName_cuando_use_constructor_vacio() {
        Cat cat = new Cat();
        assertEquals(null,cat.getName());
    }

    @Test
    void getName_cuando_use_constructor_con_parametro() {
        Cat cat = new Cat("Michi");
        assertEquals("Michi",cat.getName());
    }

    @Test
    void maullar_cuando_use_constructor_vacio() {
        Cat cat = new Cat();
        assertEquals("miau: " + null,cat.maullar());
    }

    @Test
    void maullar_cuando_use_constructor_con_parametro() {
        Cat cat = new Cat("Michi");
        assertEquals("miau: Michi",cat.maullar());
    }


}