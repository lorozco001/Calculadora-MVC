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
public class operaciones {
    public int sumar(int numero1,int numero2){
        int  suma = numero1+numero2;
        return suma;
    }
    public int restar(int numero1,int numero2){
        int resta = numero1-numero2;
        return resta;
    }
    public int multiplicar(int numero1,int numero2){
        int multiplicacion = numero1*numero2;
        return multiplicacion;     
    }
    public int dividir(int numero1,int numero2){
        int division = numero1/numero2;
        return division;
    }
}
