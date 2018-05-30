/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.vehiculo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.spring.base.Parabrisas;
import pe.edu.cibertec.spring.base.Vehiculo;

/**
 *
 * @author Java-LM
 */

@Component
@Scope(scopeName = "prototype")
public class VehiculoTerrestre extends Vehiculo {
    
    @Value(value = "${vehiculo.terrestre.aceleracion.maximo}")
    private double maximoAceleracion;
    @Value(value = "${vehiculo.terrestre.aceleracion.cambio}")
    private double cambioAceleracion;
    
    private String nombre;
    private double velocidad;
    private double aceleracion;
    private int metrosRecorridos;
    
    public VehiculoTerrestre(Parabrisas parabrisas) {
        super(parabrisas);
    }
    
    public void configurar(String nombre, double velocidad, double aceleracion){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
    }

    @Override
    public void acelerar() {
        if(this.aceleracion < maximoAceleracion){
            aceleracion += cambioAceleracion;
        }        
    }

    @Override
    public void avanzar() {
        velocidad += aceleracion;
        metrosRecorridos += (int)velocidad;
    }

    @Override
    public int metrosRecorridos() {
        return super.metrosRecorridos(); //To change body of generated methods, choose Tools | Templates.
    }
}
