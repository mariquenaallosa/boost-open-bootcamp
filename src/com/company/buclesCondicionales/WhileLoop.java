package com.company.buclesCondicionales;

public class WhileLoop {
    public static void main(String[] args) {

     //   boolean check = true;


        int count = 0;
        while (count < 10){
            count++;
            if(count == 6)
                break; //rompe
            // continue; -> saltea

        System.out.println("Hola mundo " + count);

        }
        System.out.println("fin");

    }
}
