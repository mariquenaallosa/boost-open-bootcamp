package poo.sininterfaces;

import java.util.List;
public class Main {

    public static void main(String[] args) {


        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();


        Empleado juanito = new Empleado("Juanito",30,25920,true);
        Empleado patricia = new Empleado("Patricia",27,25920,false);
        Empleado ruben = new Empleado("Ruben",40,40000,true);

        // GUARDAR EMPLEAOS
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(ruben);

        // MOSTRAR EMPLEADOS
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}
