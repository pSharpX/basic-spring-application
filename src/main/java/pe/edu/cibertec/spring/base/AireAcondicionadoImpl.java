/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.base;

import org.springframework.stereotype.Component;

/**
 *
 * @author Java-LM
 */
@Component
public class AireAcondicionadoImpl implements AireAcondicionado{

    @Override
    public void encender() {
        System.out.println("Encendiendo el aire acondicionado.....");
    }
}
