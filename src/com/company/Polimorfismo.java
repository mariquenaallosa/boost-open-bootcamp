package com.company;

public class Polimorfismo {

    public static void main(String[] args) {


        Coche coche1 = new Coche();


        CocheElectrico coche2 = new CocheElectrico();




        CocheHibrido coche3 = new CocheHibrido();

    // polimorfismo

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();


    if(coche4 instanceof Coche){
        System.out.println("coche");
    }
    if(coche4 instanceof CocheElectrico){
        System.out.println("coche eléctrico");
    }

    if(coche4 instanceof CocheHibrido){
        System.out.println("coche híbrido");
    }


    }
}
