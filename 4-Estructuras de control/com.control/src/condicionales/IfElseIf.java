package condicionales;

import java.sql.SQLOutput;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "ferbes";

        // boolean resultado1 = dia == "Lunes";
        //Lo mejor es reemplazar por equals()

        // ejemplos a comparar
        boolean resultado2 = dia.equals("Martes");
        boolean resultado3 = 5 == 5;


        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champion");
        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Ya estamos a mitad de semana");
        } else if (dia.equals("Jueves")) {
            System.out.println("Es juernes");
        } else if (dia.equals("Viernes")) {
            System.out.println("Ya es VIERNESSSSSSS");
        } else if (dia.equals("Sabado")) {
            System.out.println("¿Que haces preguntando los dias?");
        } else if (dia.equals("Domingo")) {
            System.out.println("Mañana hay que volver");
        } else {
            System.out.println(dia + " no es un día de la semana.");
        }
    }
}
