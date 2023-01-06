package Mapas;

import java.util.HashMap;

/*
*
* -------------> Mapas <----------
*
* Reciben varios nombre, entre ellos :
*   Mapas
*   Array Asociativos
*
*  Es una especie de diccionario en donde tengo una clave
* y un valor.
*
* La forma más primitiva es el HashMap
*
* NO SE PUEDE TENER UNA CLAVE DUPLICADA
*
* ->añadir     .put(clave,valor)
*
* Cuando hago un  .put() en un Map en donde ya tengo la clave
* el valor de esta clave se sobreescribe.
*
*
* -> imprimir un valor en particular     .get(clave)
*
*/
public class Mapas {

    public static void main(String[] args) {

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("clave1",10);
        mapa.put("clave2",20);
        mapa.put("clave3",30);

        System.out.println(mapa.get("clave1"));



    }



}
