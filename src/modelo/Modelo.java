/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author loroz
 */
public class Modelo {
    private int numero1;
    private int numero2;
    private double resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public double suma(int numero1,int numero2){
        this.resultado=numero1+numero2;
        return resultado;
    }
    
    public double resta(int numero1,int numero2){
        this.resultado=numero1-numero2;
        return resultado;
    }
    
    public double multiplicacion(int numero1,int numero2){
        this.resultado=numero1*numero2;
        return resultado;
    }
    
    public double division(int numero1,int numero2){
        this.resultado=numero1/numero2;
        return resultado;
    }
    
    /*public double operacion(int numero1, int numero2, String operador){
    
        if (operador=="+") {
            
        }
    return resultado;
    }*/
}
