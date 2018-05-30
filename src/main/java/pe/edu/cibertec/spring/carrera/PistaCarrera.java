/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.carrera;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.spring.base.Vehiculo;

/**
 *
 * @author Java-LM
 */
@Component
@Scope(scopeName = "singleton")
public class PistaCarrera {
    
    public void competencia(Vehiculo v1, Vehiculo v2){
        participar(v1);
        participar(v2);
    }
    
    private void participar(Vehiculo v){
        v.encenderVehiculo();
        v.colocarCancion();
        v.encenderAireAcondicionado();
        v.reclinarAsiento();
        for (int i = 1; i < 5; i++) {
            v.acelerar();
            v.avanzar();
        }
        System.out.println(String.format("Metros recorridos en total: %d", v.metrosRecorridos()));
    }
}
