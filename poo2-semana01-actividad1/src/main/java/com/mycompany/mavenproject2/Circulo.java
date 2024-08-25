package com.mycompany.mavenproject2;

public class Circulo {

    //Variables de instancia privadas
    private double radio;
    private String color;

    //Constructor predeterminado
    public Circulo() {

        this.radio = 12.5; //Valor por defecto del radio
        this.color = "azul"; //Valor por defecto el color

    }
//Constructor sobrecargado

    public Circulo(double radio) {
        this.radio = radio; //Inicializa el radio con el valor proporcionado
        this.color = "azul"; //Valor por defecto del color

    }
    //Método público para obtener el radio

    public double getRadio() {
        return radio;

    }
    //Método público para calcular y obtener el área

    public double getArea() {
        return radio * radio * Math.PI; //Fórmula del área

    }

    //Método público para obtener el color
    public String getColor() {
        return this.color;

    }
    /*
    public String toString() {
    return "Círculo [radio=" + radio + ", color=" + color + "]";
    }
     */
}
