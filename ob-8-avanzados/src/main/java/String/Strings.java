package String;

public class Strings {

    public static void main(String[] args) {
        String cadena = "Mensaje DE TEXTo";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de " + cadenaLen);


        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es "+ cadenaMinus);


        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es "+ cadenaMayus);

        // Buscar una cadena o letra en particualr al inicio
        boolean resultado = cadena.startsWith("Men");

        // Buscar una cadena o letra en particualr al final
        boolean resultado2 = cadena.endsWith("Men");

        // Mostrar un caracter en una posicion en particular.
        char letra = cadena.charAt(4);
        System.out.println("El caracter es: " + letra);

        //Recorrer una cadena
        for (int i = 0; i < cadena.length(); i++){
            System.out.println("Caracter actual: "+ cadena.charAt(i));
        }

        //Recorrer alreves
        for (int j = cadena.length(); j > 0; j--){
            System.out.println("Caracter actual: "+ cadena.charAt(j));
        }

    }
}
