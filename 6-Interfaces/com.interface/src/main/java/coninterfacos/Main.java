package coninterfacos;

import poo.sininterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();
    // Si por ejemplo Excel no nos sirve más y tenemos que pasar a MySQL bastaría con cambiar por new EmpleadoCRUD por new EmpleadoCRUDMySQL

    public static void main(String[] args) {

    empleadoCRUD.findAll();
    empleadoCRUD.save(new Empleado());
    }
}
