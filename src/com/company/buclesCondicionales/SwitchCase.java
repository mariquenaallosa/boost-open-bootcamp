package com.company.buclesCondicionales;

public class SwitchCase {

    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case  "cloudy":
                System.out.println("el tiepo está nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
                break;
        }



    }
}