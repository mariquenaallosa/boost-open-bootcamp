public class Operadores {
    public static void main(String[] args) {
        //aritmeticos
        // + - / * %
        int numero1= 10;
        int numero2= 20;

        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);

        int resultadoResta = numero1 - numero2;

        System.out.println(resultadoResta);


        // comparacion
        // == != > >= < <=

        boolean resultado1 = numero1 < numero2;

        System.out.println(resultado1);
        //Lógicos
        /*
        && -> and
        || -> or
        */

        boolean resultado3 = numero1 > 5 && numero1 < 30;

        int edad = 17;
        boolean carnetJoven = edad > 15 && edad <= 26;




    }
}
