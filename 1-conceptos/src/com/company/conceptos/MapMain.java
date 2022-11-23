package com.company.conceptos;
import java.util.HashMap;
import java.util.Map;
public class MapMain {

    public static void main(String[] args) {


    // Interfaz Map <key,value>
        Map<String, String> personas = new HashMap<>();


        personas.put("123456","Nombre Apellido 1");
        personas.put("234567","Nombre Apellido 2");
        personas.put("345678","Nombre Apellido 3");


        System.out.println(personas);
        // formas de iterar mapas
        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String value : personas.values()) {
            System.out.println(value);
        }

        // Esta nos permite obtener tanto el valor como la clave
        for (Map.Entry<String, String> pair : personas.entrySet() ){
            System.out.println(pair.getKey() + "=>" + pair.getValue());

        }

    }
}
