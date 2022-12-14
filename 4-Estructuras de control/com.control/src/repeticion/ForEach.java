package repeticion;

public class ForEach {

    public static void main(String[] args) {

        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for (String nombre : nombres){
            System.out.println(nombre);
        }

        int[] numeros = {3,5,7};
        int suma = 0;
        for (int numero : numeros){
            suma += numero;

        }
        System.out.println(suma);




    }
}
