package com.company.interfaces;

import com.company.poo.Coche;
import com.company.poo.CocheHibrido;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche deportivo");
        return new CocheHibrido();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Dando de baja el coche");
    }
}
