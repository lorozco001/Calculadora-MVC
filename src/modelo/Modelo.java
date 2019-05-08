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
    private double numero1=0;
    private double numero2=0;
    private String operador=null;
    private double resultado;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
   /* public double suma(int numero1,int numero2){
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
*/
    public double operacion(double num1, double num2, String operador){
        double res=0;
        switch (operador){
            case "+":
                res=num1+num2;
                break;
            case "-":
                res=num1-num2;
                break;
            case "*":
                res=num1*num2;
                break;
            case "/":
                res=num1/num2;
                break;
        }
        return res;
    }
}
