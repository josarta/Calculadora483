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
public class Resta extends Operacion {

    public Resta() {
    }

    public Resta(double valora, double valorb) {
        super(valora, valorb);
        super.setResultado(valora - valorb);

    }

}
