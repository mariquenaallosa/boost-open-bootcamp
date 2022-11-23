package com.company;

public class ArrayMain {


    public static void main(String[] args) {



        String nombre1 = "nombre1";
        String nombre2 = "nombre2";
        String nombre3 = "nombre3";

        String[] nombres = new String[3]; // el 3 indica la longitud
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3}; // más facil de utilizar
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];


        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;


        System.out.println(nombres);


        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        for (int i = 0; i < nombres2.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
// LOS ARRAYS SON ESTÁTICOS, NO PUEDO AGREGAR FUERA DE LOS LÍMITES