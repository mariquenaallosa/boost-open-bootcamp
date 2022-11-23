package com.company.poo;

import com.company.poo.Coche;

public class CocheElectrico  extends Coche {

    String motorElectrico;


    public CocheElectrico() {

    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante,String modelo,Double peso,Double largo, String motorElectrico){
        super (color,fabricante,modelo, peso,largo);
        this.motorElectrico = motorElectrico;
    }


    /*Override -> sobreescritura
    * sirve para aportar metadatos a clases o métodos
    *
    * super -> método para acceder a la clase superior. Se puede usar tanto para comportamientos o métodos , como para
    * invocar contructores
    * */
    @Override
    public void acelerar(Integer cantidad){
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);

    }


    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';

    }

}
