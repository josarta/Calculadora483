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
public class Operacion {
    private double valora = 0;
    private double valorb = 0;
    private double resultado = 0;

    public Operacion() {
    }
    
    public Operacion( double valora, double valorb) {
        this.valora = valora;
        this.valorb = valorb;
    }
    
    
    public double mostrarResultado(){
        return this.resultado;
    }

    public double getValora() {
        return valora;
    }

    public void setValora(double valora) {
        this.valora = valora;
    }

    public double getValorb() {
        return valorb;
    }

    public void setValorb(double valorb) {
        this.valorb = valorb;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    
    
    
    
    
    
    
    
    
    
}
