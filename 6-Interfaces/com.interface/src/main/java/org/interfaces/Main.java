package org.interfaces;

public class Main {

    public static void main(String[] args) {


        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();


        Empleado juanito = new Empleado("Juanito",30,25920,true);
        Empleado patricia = new Empleado("Patricia",27,25920,false);
        Empleado ruben = new Empleado("Ruben",40,40000s,true);

        // GUARDAR EMPLEAOS
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(ruben);

    }
}
