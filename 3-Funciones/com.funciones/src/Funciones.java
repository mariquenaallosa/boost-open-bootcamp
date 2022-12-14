public class Funciones {

    public static void main(String[] args) {


        // opcion 1: funcion sin parametro y sin tipo de retorno
//         showMenu();
//         showMenu();


        // opcion 2: funcion sin parametro y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());
        
        double price = getPrice();
        System.out.println(price);

        // opcion 3: funcion con parametro y sin tipo de retorno
        imprimirSaludo("OpenBootcamp");


        // opcion 4: funcion con parametros y con tipo de retorno
        String nombre= "Mariquena";
        String apellido = "Allosa";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int numero1 = 50;
        int numero2 = 200;
        int resultadoSuma = suma(numero1,numero2);
    }
    static int suma(int numero1,int numero2){
        return numero1 + numero2;
    }
    static String obtenerSaludo(String nombre, String apellido){
        return "Buenas tardes "+ nombre+" "+ apellido;
    }
    static void imprimirSaludo(String nombre) {
        System.out.println("Buenas tardes " + nombre);
    }

    static double getPrice() {
        return 100.99;
    }


    /*
    * void indica que no devuelve nada
    * */
    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    };

    static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas: \n 1 - Ver zapatillas";
    };
}
