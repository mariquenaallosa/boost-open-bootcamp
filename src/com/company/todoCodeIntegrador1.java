package com.company;
import java.util.Scanner;

public class todoCodeIntegrador1 {
    /*
    * una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos
    * pueden tener 3 categorías:
    * 1- repositor
    * 2-cajero
    * 3- supervisor
    *
    *  * Los repositores cobran $15.890 + un bono del 10%
    *  * Los cajeros cobran 25.630,89 fijos
    *  * Los supervisores cobran 35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
    *
    * Se necesita un programa que , dependiendo de que tipo de empleado del que se trate ,
    * calcule y muestre en pantalla el correspondiente sueldo.
    * */
    public static void main(String[] args) {
        int categoria;
        double salario=0;

        System.out.println("ingrese el tipo de categoria que desea calcular el salario");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        if (categoria == 1){
            salario = 15890 + (15890*0.10);
        } else if (categoria == 2) {
                salario = 25630.89;
        } else if (categoria == 3){
            salario = 35560.20 -(35560.20*0.11);
        }else {
            System.out.println("debe ingresar un número de categoría válido");
        }
        if(categoria ==1 || categoria==2 ||categoria==3) {
            System.out.println("El total del sueldo para la categoria seleccionada " + categoria + " es igual a : $" + salario);
        }
    }
}
