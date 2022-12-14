package condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia= "artes";

        switch (dia){
            case "Lunes":
                System.out.println("Animo con la semana champion");
                break;
            case "Martes":
                System.out.println("Martes con M de Me besas");
                break;
            case "Miercoles":
                System.out.println("Ya estamos a mitad de semana");
                break;
            case "Jueves":
                System.out.println("Es juernes");
                break;
            case "Viernes":
                System.out.println("Ya es VIERNESSSSSSS");
                break;
            case "Sabado":
                System.out.println("¿Que haces preguntando los dias?");
                break;
            case "Domingo":
                System.out.println("Mañana hay que volver");
                break;
            default:
                System.out.println(dia + " no corresponde a un día de la semana");
                break;
        }
    }
}
