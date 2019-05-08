/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.Border;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author loroz
 */
public class Controlador implements ActionListener{
 
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view= view;
        this.model=model;
        cargaBotones();
        
    }
    public void cargaBotones(){
        this.view.jButtonC.addActionListener(this);
        this.view.jButtonAC.addActionListener(this);
        
        this.view.jButtonCero.addActionListener(this);
        this.view.jButtonUno.addActionListener(this);
        this.view.jButtonDos.addActionListener(this);
        this.view.jButtonTres.addActionListener(this);
        this.view.jButtonCuatro.addActionListener(this);
        this.view.jButtonCinco.addActionListener(this);
        this.view.jButtonSeis.addActionListener(this);
        this.view.jButtonSiete.addActionListener(this);
        this.view.jButtonOcho.addActionListener(this);
        this.view.jButtonNueve.addActionListener(this);
        this.view.jButtonPunto.addActionListener(this);
        
        this.view.jButtonSuma.addActionListener(this);
        this.view.jButtonResta.addActionListener(this);
        this.view.jButtonMultiplicacion.addActionListener(this);
        this.view.jButtonDivision.addActionListener(this);
        this.view.jButtonIgual.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Calculadora");//titulo de la ventana
        view.setLocationRelativeTo(null); //posision de la ventana en el centro
        view.setResizable(false);
        view.setIconImage(new ImageIcon(getClass().getResource("/vista/calculadora.png")).getImage());
        view.jText1.setBorder(null);
        view.jText1.setEditable(false);//txt en modo no editable
        view.jText1.setBackground(Color.WHITE);//txt color blanco
        view.jText1.setHorizontalAlignment(JTextField.RIGHT);//alinear texto a la derecha
        
        view.jText2.setBorder(null);
        view.jText2.setEditable(false);
        view.jText2.setBackground(Color.WHITE);//txt color blanco
        view.jText2.setHorizontalAlignment(JTextField.RIGHT);//alinear texto a la derecha
        view.jPanel1.setBackground(Color.WHITE);
        //view.jPanel1.setBorder((Border) Color.BLUE);
        
        
   
    }
    
    private double campovacio(String campo){
        double var1;
        if(campo.length()==0){
            var1=0;
            return var1;
        }else{
            var1=Double.parseDouble(campo);
            return var1;
        } 
    }
    private double campovacio2(String campo){
        double var1;
        if(campo.length()==0){
            var1=1;
            return var1;
        }else{
            var1=Double.parseDouble(campo);
            return var1;
        } 
    }
    
    private static boolean existepunto(String cadena){
        boolean var1;
        var1=false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i,i+1).equals(".")) {
                var1=true;
                break;
            }
        }
        return var1;
    }
    private void borar(){
         view.jText1.setText("");
            view.jText2.setText("");
            model.setNumero1(0);
            model.setNumero2(0);
            model.setOperador(null);
            model.setResultado(0);
    }
    
    private void operacion(String operador){
        if(model.getOperador()== null){
            model.setNumero1(campovacio(view.jText1.getText()));
            model.setOperador(operador);
            view.jText1.setText("");
            view.jText2.setText(""+model.getNumero1());
        }else if(model.getOperador().equals("+")||  model.getOperador().equals("-")){
            model.setNumero2(campovacio(view.jText1.getText()));        
            model.setResultado(model.operacion(model.getNumero1(),model.getNumero2(),model.getOperador())); 
            model.setOperador(operador);
            view.jText1.setText("");
            model.setNumero1(model.getResultado());
            view.jText2.setText(""+model.getNumero1());
        }else{
            model.setNumero2(campovacio2(view.jText1.getText()));        
            model.setResultado(model.operacion(model.getNumero1(),model.getNumero2(),model.getOperador())); 
            model.setOperador(operador);
            view.jText1.setText("");
            model.setNumero1(model.getResultado());
            view.jText2.setText(""+model.getNumero1());
        }
    }
 
    //acciones de los botones
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource()== view.jButtonCero) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"0");
            }else{
                view.jText1.setText(view.jText1.getText()+"0");
            }
        }else if (e.getSource()== view.jButtonUno) { 
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"1");
            }else{
                view.jText1.setText(view.jText1.getText()+"1");
            }
        }else if (e.getSource()== view.jButtonDos) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"2");
            }else{
                view.jText1.setText(view.jText1.getText()+"2");
            }
        }else if (e.getSource()== view.jButtonTres) {
           if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"3");
            }else{
                view.jText1.setText(view.jText1.getText()+"3");
            }
        }else if (e.getSource()== view.jButtonCuatro) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"4");
            }else{
                view.jText1.setText(view.jText1.getText()+"4");
            }
        }else if (e.getSource()== view.jButtonCinco) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"5");
            }else{
                view.jText1.setText(view.jText1.getText()+"5");
            }
        }else if (e.getSource()== view.jButtonSeis) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"6");
            }else{
                view.jText1.setText(view.jText1.getText()+"6");
            }
        }else if (e.getSource()== view.jButtonSiete) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"7");
            }else{
                view.jText1.setText(view.jText1.getText()+"7");
            }
        }else if (e.getSource()== view.jButtonOcho) {
          if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"8");
            }else{
                view.jText1.setText(view.jText1.getText()+"8");
            }
        }else if (e.getSource()== view.jButtonNueve) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    view.jText1.setText(view.jText1.getText()+"9");
            }else{
                view.jText1.setText(view.jText1.getText()+"9");
            }
        }else if (e.getSource()== view.jButtonPunto) {
            if ("=".equals(model.getOperador())) {
                    borar();
                    if (view.jText1.getText().length()==0) {
                    view.jText1.setText("0.");
                }else if(!existepunto(view.jText1.getText())){
                    view.jText1.setText(view.jText1.getText()+".");
                }else if(model.getResultado()== Double.parseDouble(view.jText1.getText())){
                    view.jText1.setText("0.");
                    view.jText2.setText(""+model.getResultado());
                }
            }else{
                if (view.jText1.getText().length()==0) {
                    view.jText1.setText("0.");
                }else if(!existepunto(view.jText1.getText())){
                    view.jText1.setText(view.jText1.getText()+".");
                }else if(model.getResultado()== Double.parseDouble(view.jText1.getText())){
                    view.jText1.setText("0.");
                    view.jText2.setText(""+model.getResultado());
                }
            }
        }
         else if (e.getSource()== view.jButtonSuma) {
            String suma="+";
            operacion(suma);
        }else if (e.getSource()== view.jButtonResta) {
            String resta="-";
            operacion(resta);
        }else if (e.getSource()== view.jButtonMultiplicacion) {
            String multi="*";
            operacion(multi);
        }else if (e.getSource()== view.jButtonDivision) {
            String div="/";
            operacion(div);
        }else if (e.getSource()== view.jButtonIgual) {
          if(model.getOperador()!= null){
            model.setNumero2(campovacio(view.jText1.getText()));        
            model.setResultado(model.operacion(model.getNumero1(),model.getNumero2(),model.getOperador())); 
            model.setOperador("=");
            view.jText1.setText(""+model.getResultado());
            view.jText2.setText(""); 
          }
          
        }
        
        
        else if (e.getSource()== view.jButtonC) {
            if (view.jText1.getText().length()>0) {
                String var1=view.jText1.getText().substring(0,view.jText1.getText().length()-1);
                view.jText1.setText(var1);  
            }else{
                view.jText1.setText("");
            }
           
           
        }else if (e.getSource()== view.jButtonAC) {
            borar();
            /*view.jText1.setText("");
            view.jText2.setText("");
            model.setNumero1(0);
            model.setNumero2(0);
            model.setOperador(null);
            model.setResultado(0);*/
        }
    }
}
