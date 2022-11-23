package com.company.conceptos;

public class Tipos {
    public static void main(String[] args) {


        // tipo identificador = valor;
        // tipo identificador;
        //identificador = 30;

        //ENTEROS -> PRIMITIVO
        byte number1 = 1;   // 1 byte
        short number2 = 2;  // 2 byte
        int number3 = 3;    // 4 byte                           -> más utilizados
        long number4 = 4l;   // 8 byte -> mayor capacidad        -> más utilizados

        //PUNTO FLOTANTE -> PRIMITIVO
        float decimal1 = 4.9f;
        double decimal2 = 9.99d; //-> mayor capacidad

        //CARACTER -> PRIMITIVO
        char caracter1 = 'a';

        //BOOLEANOS -> PRIMITIVO
        boolean verdadero = true;
        boolean falso = false;

        // CADENAS DE TEXTOS
        String nombre = "Mariquena";
        String apellido = "Allosa";

        // TIPOS ENVOLTORIO
        Integer numero = null;
        Long numero2= 2L;
    }
}
