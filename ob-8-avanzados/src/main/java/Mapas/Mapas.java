package Mapas;

import java.util.HashMap;
import java.util.Map;

/*
*
* -------------> Mapas <----------
* -------------->HashMap<----------
* Reciben varios nombre, entre ellos:
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
*  -> reemplazar valore en el mapa
*           -> .put(clave,valor)
*                           Si existe, sobreescribe
*                           Si no existe, crea
*           -> .replace(clave,valor)
*                           Si existe, reempalza
*                           Si no existe, lo ignora
*
*
* -> eliminar valores    .remove(clave)
*
*
* -> recorrer mapa      for
*
* Para recorrer el HashMapa debo usar Map.Entry elemento : mapa.entrySet()
*
* entrySet lo que hace es asignar a elemento cada valor del mapa a medida que lo recorre
*
*/
public class Mapas {

    public static void main(String[] args) {

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("clave1",10);
        mapa.put("clave2",20);
        mapa.put("clave3",30);
        mapa.replace("clave4",70);

        System.out.println(mapa.get("clave1"));
        mapa.put("clave3",90);
        mapa.replace("clave1",30);

        //mapa.remove("clave1");

        for(Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("El valor es: " + elemento.getValue());
        }
    }



}
