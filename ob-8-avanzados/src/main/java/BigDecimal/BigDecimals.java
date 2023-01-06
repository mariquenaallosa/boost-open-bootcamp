package BigDecimals;
import java.math.BigDecimal;

/*
 *
 * Si en cuestiones financieras(numero grandes - necesitan mucha precision) confío en double o float
 * voy a tener muchos problemas a largo plazo, porque no es
 * tan bueno como parece.
 *
 * ------------> BigDecimal <--------------
 *
 * Cuando se opera con BigDecimal , se espera que todos los datos sean BigDecimal
 * multiplacir -> .multiply()
 * sumar -> .add()
 *
 */
public class BigDecimals {

    public static void main(String[] args) {

        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(0.1f);

        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());

    }
}
