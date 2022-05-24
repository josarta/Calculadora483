/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.modelo;

/**
 *
 * @author josar
 */
public class Suma extends Operacion{
    public Suma() {
    }
    public Suma(double valora, double valorb){
        super(valora, valorb);
        super.setResultado(valora + valorb);       
    }    
}
