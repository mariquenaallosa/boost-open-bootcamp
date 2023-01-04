package Vectores;
/*
 * *
 *
 * Vectores son similares a los arrays pero sin tamaño definido
 ** crecen automáticamente
 ** pueden decrecer hasta su tamaño
 ** crecer y decrecer un array no es gratuito computacionalmente, se puede realentizar mucho
 ** Lo ideal es siempre crearlo con la capacidad que creemos que vamos a llegar, porque, sino se va a volver muy lente
 ** Hay que evitar resizing
 *
 * También se pueden llamar arrays dinámicos
 *
 * Tienen propiedades:
 *
 * -> tamaño: sería la longitud, son los elementos
 * -> capacidad: como de grande es el array subyacente. Aumenta a medida que añadimos elementos.
 *
 * Beneficio: aumenta automáticamente y no tengo que preocuparme de ello.
 *
 * Desventaja: al ser un array, cuando la capacidad tiene que aumentar utiliza muchos recursos porque lo que hace
 *              no es simplemente agregar espacios o lugares, sino que lo que hace es copiar los datos a un nuevo array
 *              y así todas veces que se llegue a la capacidad límite
 *
 * Al vector le podemos decir la capacidad de crecimiento para evitar la mayor cantidad de resizing
 *  -------------------------- new Vector (capacidadInicial, capacidadIncremento) ----------------------------------
 *
 * puede usar concurente - Multithreading
 *
 * -> añadir elemento .add()
 * -> eliminar elemento  .remove()
 * -> comparar   vectorejemplo.equals(vectorcomparar)
 * -> recorrer
 *
 * */

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector( 4096, 15);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("Datos del vector "+ vector);

        vector.remove(2);
        System.out.println("Datos del vector "+ vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());


        Vector<Integer> vector1 = new Vector();
        vector1.add(1);
        vector1.add(2);

        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(4);

        // comparar vectores
        boolean resultado = vector1.equals(vector2);
        System.out.println("Son iguales? " + resultado);

        // recorrer un vector
        Vector<Integer> vector3 = new Vector(128);
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        vector3.add(4);
        System.out.println(vector3);

        for (int i : vector3){
            System.out.println("Valor actual en el vector: "+ i);
        }


        for (int i = 0 ; i < vector3.size(); i++){
            if(i % 2 == 0 ){
                vector3.remove(i);
                continue;
                //Si no le pongo el continue , me da error porque no puedo acceder a esa posicion
            }
            System.out.println("Valor es: " + vector3.get(i) + " en posicion " + i);
        }

        Vector<Integer> vector4 = new Vector(16);
        vector4.add(1);
        vector4.add(2);
        vector4.add(3);
        vector4.add(4);


        System.out.println("Capacidad del vector: " + vector4.capacity());
        System.out.println("Tamaño del vector: " + vector4.size());

        // Decrecer el vector para ahorrar memoria
        // .trimToSize() -> decrece la capacidad del vector hasta el tamaño del vector

        vector4.trimToSize();
        System.out.println("Capacidad del vector: " + vector4.capacity());
        System.out.println("Tamaño del vector: " + vector4.size());

    }
}
