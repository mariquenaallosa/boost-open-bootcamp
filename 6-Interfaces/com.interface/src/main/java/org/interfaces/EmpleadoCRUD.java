package org.interfaces;


import java.util.ArrayList;
import java.util.List;

/*
* C -> CREATE
* R -> READ/RETRIEVE
* U -> UPDATE
* D -> DELETE
 */

public class EmpleadoCRUD {

    private List<Empleado> empleados = new ArrayList<Empleado>();

    /*
    *
    * Una interface seria como un contrato que define una serie de metodos de que hay que hacer pero no los hace sino que hay una clase que implementa la interfaz y es la que realiza los metodos
    *
    * Un ejemplo de Interface seria por ejemlo -> List
    *
    *
     */

    //CREATE
    //guardar un empleado
    //actuaria como una base de datos


    public void save(Empleado empleado){

        empleados.add(empleado);

    }

    // RECUPERAR EMPLEADOS
    public List<Empleado> findAll(){
    return empleados;
    }
}
