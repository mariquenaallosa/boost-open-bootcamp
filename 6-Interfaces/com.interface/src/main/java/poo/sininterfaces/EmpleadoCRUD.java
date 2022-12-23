package poo.sininterfaces;


import java.util.ArrayList;
import java.util.List;

/*
* C -> CREATE
* R -> READ/RETRIEVE
* U -> UPDATE
* D -> DELETE
 */

public class EmpleadoCRUD {

    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<Empleado>();



    //CREATE
    //guardar un empleado
    //actuaria como una base de datos


    public void save(Empleado empleado){

        empleados.add(empleado);

    }

    // RECUPERAR EMPLEADOS- READ
    public List<Empleado> findAll(){
    return empleados;
    }
}
