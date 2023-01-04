package Arrays;

public class Arrays {

    public static void main(String[] args) {

        /*
        *
        * Cuando no sabemos que datos van dentro lo declaramos así
        * 1- declaramos
        * 2- inicializamos manualmente
        *
        int array1[] = new int[5];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

       */

        // Cuando conocemos los datos
        int array2[] = {1, 2, 3, 4, 5};


        for (int i : array2) {
            System.out.println(i);
        }

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        System.out.println("Longitud del array: " + nombres.length);

        // similar a foreach -> es el for, pero de forma corta, sólo muestra el contenido
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        // forma larga -> tiene la ventaja de obtener la posición del contenido
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Nombre actual: " +nombres[i] + " en la posición " + i);

        }
        // Los arrays tienen una limitación y es que una vez que declaro, no puedo tener más elementos de los que dije que iba a tener.
        // Es decir, que no puedo agregar algo más
        // SI PUEDO, MUTARLOS(los valores)

        // Los arrays son multidimensionales
        // tipo arrayN [][] = new tipo [filas][columnas];

        // cuando no conocemos lo valores iniciales
        int arrayBidi[][] = new int [2][4];

        arrayBidi[0][0]= 1;
        arrayBidi[0][1]= 2;
        arrayBidi[0][2]= 3;
        arrayBidi[0][3]= 4;

        arrayBidi[1][0]= 10;
        arrayBidi[1][1]= 20;
        arrayBidi[1][2]= 30;
        arrayBidi[1][3]= 40;

        // inicializar arrarBidimensional cuando si conocemos el valor
        int arrayBidi2[][] = {
                {1,2,3,4},
                {10,20,30,40}
        };

        for (int i = 0 ; i < arrayBidi.length; i++){
            System.out.println("Valor de i:" + i);
            for (int j = 0 ; j < arrayBidi[1].length; j++){
                System.out.println("Estoy en i: " + i + ". Valor de j:" + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        String nombres2[] = {"Pepe", "Juan"};
        nombres2[0]= "Victor";
        nombres2[1]= "Paco";


        for (String nombre : nombres2){
            System.out.println(nombre);
        }

    }
}
