package br.com.study.danielemidio.forma;

public class Quadrado implements Forma{
    double lado;

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
