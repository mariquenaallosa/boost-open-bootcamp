public class Ejercicio2 {
    /*
    * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    */
    public static void main(String[] args) {

        double precio = 233.58;
        double precioConIva = getPrice(precio);
        System.out.println(precioConIva);

    }

    static double getPrice(double precio){
        return precio + (precio*0.21);
    }
}
