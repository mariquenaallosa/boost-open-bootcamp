package com.company;
import com.company.poo.Coche;
import com.company.poo.CocheElectrico;

import java.util.ArrayList;
import java.util.List;
public class ListMain {


    public static void main(String[] args) {
        // Son como arrays pero dinámicos
        // Es una interface
        List<String> nombres = new ArrayList<>();

        nombres.add("nombre1");
        nombres.add("nombre2");
        nombres.add("nombre3");
        nombres.add("nombre4");
        nombres.add("nombre5");
        nombres.add("nombre6");
        nombres.add("nombre7");
        nombres.add("nombre8");
        nombres.add("nombre9");

        System.out.println(nombres);

       for (String nombre : nombres){
           System.out.println(nombre);
        }
        List<Coche> coches = new ArrayList<>();

       coches.add(new CocheElectrico());
        coches.add(new CocheElectrico());
        coches.add(new CocheElectrico());
        coches.add(new CocheElectrico());
        coches.add(new CocheElectrico());

        System.out.println(coches);

        for (Coche coche: coches
             ) {
            System.out.println(coche);
        }

    }
}
