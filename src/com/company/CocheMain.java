package com.company;

public class CocheMain {
    public static void main(String[] args) {

    String coche = "alfa romero";

    Coche cocheObj = new Coche();

    Coche cocheObj2 = new Coche("rojo","Honda","civic", 1430.45, 5.4);
    cocheObj2.acelerar(20);

        System.out.println(cocheObj2);

    CocheElectrico cocheElectrico = new CocheElectrico();
    cocheElectrico.motorElectrico= "Motor E14FG";
    cocheElectrico.color = "verde";
    cocheElectrico.fabricante = "Sura";
    cocheElectrico.modelo ="Pinker";
    cocheElectrico.acelerar(20);


        System.out.println(cocheElectrico);
        CocheElectrico cocheElectrico2 = new CocheElectrico("azul","alfa","romeo",1500d,4.99,"TXZ");
        System.out.println(cocheElectrico2);
    }
}
