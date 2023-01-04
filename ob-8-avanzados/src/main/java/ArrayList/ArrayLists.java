package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/*
*
*-----------------> ArrayList <----------------
** Muy similar a vectores, porque ambas derivan de AbstractList.
*
** Implementan la interfaz ArrayList
** Implementation de la superclase List
** No están sincronizados, no puedo modificar de forma concurrente (a la vez) dos arrayList
* -> NO Multithreading.
*
* A diferencia de los vectores no tiene -> .capacity()
*
* Cómo aumenta cuando tiene overflow? Suma un 50% no la dobla como los vectores
* Capacidad ArrayList = Capacidad ArrayList + Capacidad ArrayList * 0.5
*
* -> obtener valor .get()
* -> convertir en Array
*   - Declarar un array
*   - tamaño del ArrayList con arrayList.size()
*   - recorrer la lista.
*
* -> convertir a medida que recorremos
*   - utilizando clase Object
*   no es lo más común pero se puede
*
*
*
* ---------------> LinkedList <----------------
*
* se declaran igual
* tiene los mismos métodos
* las mismas propiedades
* operan de la misma forma
*
* Se puede crear a partir de un ArrayList sin problema alguno
* se realiza una copia
*
*
* -------> Diferencias <--------
*
* 1 - ArrayList utiliza un Array de forma subyacente y una LinkedList utiliza un tipo de dato que se llama
* lista doblemente enlazada.
*   ArrayList -> array es más rápido para almacenar y buscar datos.
*   LinkedList -> más rápida para modificar datos.
*
* 2 - ArrayList deriva de la Clase List, implementa o hereda los métodos de dicha clase. Mientras que LinkedList
* implementa dos interfaces List, Deque.
* LinkedList -> se puede usar para implementar colas.
* Colas:
* ->FIFO: lo primero que entra es lo primero que sale. Ej: cafeteria
* ->LIFO: lo último que entra es lo primero que sale. Ej: edificio
*
*
*
*
* */
public class ArrayLists {


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");

        // Cuando es String se puede pasar el valor que queremos eliminar o su posición
        lista.remove("ElementoB");
        System.out.println("Contenido: " + lista);

        for (String nombre: lista) {
            System.out.println(nombre);
        }

        for (int i = 0 ; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        String array[] = new String[lista.size()];
        for (int i = 0 ; i<lista.size(); i++){
            array[i] = lista.get(i);
        }

        //Mostramos el contenido de array
        System.out.println("-----------------");
        for (String elemento : array){
            System.out.println(elemento);
        }

        System.out.println("-----------------");
        //Convertir mientras recorremos
        for (Object arrayObject : lista.toArray()){
            System.out.println(arrayObject.toString());
        }

        // LinkedLsit

        LinkedList<String> listaEnlazada = new LinkedList<String>();


        // Crear a partir de un ArrayList
        LinkedList<String> listaEnlazada2 = new LinkedList<String>(lista);

    }
}
