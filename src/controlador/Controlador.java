/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        this.view.jButtonSuma.addActionListener(this);
        this.view.jButtonResta.addActionListener(this);
        this.view.jButtonMultiplicacion.addActionListener(this);
        this.view.jButtonDivision.addActionListener(this);
        this.view.jButtonIgual.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Calculadora");
        view.setLocationRelativeTo(null); 
    }
    
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource()== view.jButtonCero) {
            view.jText1.setText(view.jText1.getText()+"0");
        }else if (e.getSource()== view.jButtonUno) {
            view.jText1.setText(view.jText1.getText()+"1");
        }else if (e.getSource()== view.jButtonDos) {
            view.jText1.setText(view.jText1.getText()+"2");
        }else if (e.getSource()== view.jButtonTres) {
            view.jText1.setText(view.jText1.getText()+"3");
        }else if (e.getSource()== view.jButtonCuatro) {
            view.jText1.setText(view.jText1.getText()+"4");
        }else if (e.getSource()== view.jButtonCinco) {
            view.jText1.setText(view.jText1.getText()+"5");
        }else if (e.getSource()== view.jButtonSeis) {
            view.jText1.setText(view.jText1.getText()+"6");
        }else if (e.getSource()== view.jButtonSiete) {
            view.jText1.setText(view.jText1.getText()+"7");
        }else if (e.getSource()== view.jButtonOcho) {
            view.jText1.setText(view.jText1.getText()+"8");
        }else if (e.getSource()== view.jButtonNueve) {
            view.jText1.setText(view.jText1.getText()+"9");
        }
        
    }
}
