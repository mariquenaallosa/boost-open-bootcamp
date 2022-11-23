package com.company;

public class TryCatchMain {

    public static void main(String[] args) {

        try {
            // Aquí va el código que puede generar problemas
            int result = 5 / 5;
        } catch (ArithmeticException e){
            // Aquí va el código que captura la excepción
            e.printStackTrace(); // para registrar el fallo
        } finally {
            //Se ejecuta siempre si o si
            // para cerrar conexiones, archivos o algo así
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");

    }
}
