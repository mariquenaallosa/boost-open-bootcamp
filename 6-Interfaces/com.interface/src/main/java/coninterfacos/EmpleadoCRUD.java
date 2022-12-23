package coninterfacos;

import poo.sininterfaces.Empleado;

import java.util.List;

/*
 *
 * funciona como abstraccion
 *
 * Una interface actúa como un contrato que define una serie de metodos de que hay que hacer pero no los hace sino
 * que hay una clase que implementa la interfaz y es la que realiza los metodos
 * Sólo declaran métodos, no los implementa
 * Un ejemplo de Interface seria por ejemlo -> List
 *
 *
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
