/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matriz;

/**
 *
 * @author alexf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        ventana window = new ventana();
        window.setTitle("Calculadora");
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
}
