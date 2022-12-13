public class Funciones {

    public static void main(String[] args) {


        // opcion 1: funcion sin parametro y sin tipo de retorno
        // showMenu();
        // showMenu();


        // opcion 2: funcion sin parametro y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
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
