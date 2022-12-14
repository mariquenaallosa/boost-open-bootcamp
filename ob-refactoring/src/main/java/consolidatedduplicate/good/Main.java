package consolidatedduplicate.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;



    double calculateExtraSalary() {
        double result = 0;
        if(isElegibleExtraSalary()){
            result = 500;
        }else {
            result = 0;
        }
        sendMessage();
        return result;

    }

    private void sendMessage(){
        // send email
        // connect smtp
        System.out.println("Sending message");
    }

    private boolean isElegibleExtraSalary(){
        // agrupar condiciones utilizando AND (&&) y OR(||)
        boolean estudios = seniority < 1 || education < 1;
        boolean antiguedad = incidents > 10 && certification;
        return estudios || antiguedad;
    }

}
