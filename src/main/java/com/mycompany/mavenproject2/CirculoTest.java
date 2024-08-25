package com.mycompany.mavenproject2;

public class CirculoTest {

    public static void main(String[] args) {

        Circulo acirculo = new Circulo();

        //Imprimir el radio del Circulo a
        System.out.println("El radio del círculo a es: " + acirculo.getRadio());

        //Imprimir el área del círculo a
        System.out.println("El área del círculo a es: " + acirculo.getArea());

        //Constructor sobrecargado, radio es igual a 6.55
        Circulo bcirculo = new Circulo(6.55);

        //Imprimir el radio del Circulo b
        System.out.println("El área del circulo b es: " + bcirculo.getRadio());
        //Imprimir el radio del Circulo b
        System.out.println("El área del cirulo b es: " + bcirculo.getArea());

    }

}
