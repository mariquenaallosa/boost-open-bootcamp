package com.company;
// no se puede crear objetos de clases abstractas
public abstract class Coche {
        // atributos
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double largo;
        Integer velocidad = 0;

        //contructores
        public Coche() {

        }
        public Coche(String color, String fabricante,String modelo,Double peso,Double largo) {
                this.color = color;
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.peso = peso;
                this.largo = largo;
        }
        //metodos - comportamientos
        public void acelerar ( Integer cantidad){
                if(cantidad > 0 && cantidad <= 120){
                        this.velocidad += cantidad;
                }
        }

        @Override
        public String toString() {
                return "Coche{" +
                        "color='" + color + '\'' +
                        ", fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", peso=" + peso +
                        ", largo=" + largo +
                        ", velocidad=" + velocidad +
                        '}';
        }
}
