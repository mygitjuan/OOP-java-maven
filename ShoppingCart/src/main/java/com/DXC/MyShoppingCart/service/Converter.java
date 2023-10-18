package com.DXC.MyShoppingCart.service;


public class Converter {

    public static int convert(String texto) {
        int valor = Integer.parseInt(texto);
        if (valor < -32768 || valor > 32768) throw new NumberFormatException("Demasiado grande");
        else return valor;
    }

}