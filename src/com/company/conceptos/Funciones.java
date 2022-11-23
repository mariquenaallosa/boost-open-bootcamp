package com.company.conceptos;

public class Funciones {
    public static void main(String[] args) {


    //    holaMundo();
    //    holaMundo();

    //    holaMundo("Mariquena");
    //    holaMundo("Aldana");

        String hola = devolverHolaMundo();
        System.out.println(hola);

    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }
    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }
    private static void holaMundo(String name, String surname) {
        System.out.println("Hola " + name + " " + surname);
    }

    private static String devolverHolaMundo() {
        return "Hola";
    }



}
