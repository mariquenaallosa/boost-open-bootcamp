package condicionales;

public class If {


    public static void main(String[] args) {

        int edad = 17;
        boolean esMayor = edad >= 18;

        if(esMayor) {
            System.out.println("Es mayor de edad");
        }
        if(edad >= 18){
            System.out.println("Puede sacar el carnet dado que su edad es "+ edad + " es decir, que eres mayor de edad");
        }

        System.out.println("Es menor de edad");



    }
}
