package com.company;

public class CocheMain {
    public static void main(String[] args) {

    String coche = "alfa romero";

    Coche cocheObj = new Coche();

    Coche cocheObj2 = new Coche("rojo","Honda","civic", 1430.45, 5.4);
    cocheObj2.acelerar(20);

        System.out.println(cocheObj2);







    }
}
