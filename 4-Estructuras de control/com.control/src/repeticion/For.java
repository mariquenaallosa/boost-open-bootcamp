package repeticion;

public class For {


    public static void main(String[] args) {


        for (int i = 0; i < 20; i++){
            System.out.println("El valor es: " + i);
            System.out.println("Hola mundo");
        }

        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Hola "+ nombres[i]);
        }

        int[] numeros = {3,5,7};
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
            System.out.println("El resultado es: " + suma);
        }

    }
}
