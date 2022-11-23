package com.company;

import java.util.Locale;

public class StringMain {


    public static void main(String[] args) {
        // La clase String

        /*
        length()
        startWith()
        endsWith()
        indexOf()
        subString(inicio,final)
        trim()
        equals()
        compareTo

         */


        String mensaje = "  hola mundo";


        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);

        String mensajeEspacios = mensajeMay.trim();

        System.out.println(mensajeEspacios);


//equalsIgnoreCase-> ignora may y min
        String otro = "HOLA MUNDO";

        if(mensajeEspacios.equals(otro)){
            System.out.println("verdadero");
        }
    }
}
