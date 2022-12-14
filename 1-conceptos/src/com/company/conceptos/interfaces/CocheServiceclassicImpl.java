package com.company.conceptos.interfaces;

import com.company.poo.Coche;
import com.company.poo.CocheElectrico;

public class CocheServiceclassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}


/*
* Las clases que implementan interfaces están obligadas a ponerle cuerpo
* */