public class Sobrecarga {
/**
 *
 * Sobrecarga permite duplicar un método siempre y cuando tengan diferente número/tipo de parámetros
 * 1- Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido
 */
    public static void main(String[] args) {

        double precio = 23.58;
        double precioConIva = getPrice(precio);
        System.out.println(precioConIva);


    }
    static double getPrice(double precio){
        return precio + 5.17;
    }
    static double suma(double numero1,double numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1,int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1,int numero2,int numero3){
        return numero1 + numero2 + numero3;
    }
}
