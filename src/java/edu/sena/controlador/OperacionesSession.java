/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador;

import edu.sena.modelo.Division;
import edu.sena.modelo.Multiplicacion;
import edu.sena.modelo.Resta;
import edu.sena.modelo.Suma;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author josar
 */
@Named(value = "operacionesSession")
@SessionScoped
public class OperacionesSession implements Serializable {

    private double valora = 0.0;
    private double valorb = 0.0;
    private double resultado = 0.0;

    /**
     * Creates a new instance of OperacionesSession
     */
    public OperacionesSession() {
    }

    public void sumarvalores() {
        Suma objsuma = new Suma(valora, valorb);
        resultado = objsuma.mostrarResultado();
    }
    
    public void restarvalores() {
        Resta objresta = new Resta(valora, valorb);
        resultado = objresta.mostrarResultado();
    }

    public void multiplicarvalores() {
        Multiplicacion objmul = new Multiplicacion(valora, valorb);
        resultado = objmul.mostrarResultado();
    }

    public void divisionvalores() {
        Division objdiv = new Division(valora, valorb);
        resultado = objdiv.mostrarResultado();
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
