package repeticion;

public class While {


    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {
            System.out.println(" Valor de contador: " +contador );
            contador++;
            if(contador == 5){
                // break; -> termina el bucle
                // continue -> saltea
                continue;
            }

        }



//        do {
//
//        } while(){
//
//        }


    }
}
