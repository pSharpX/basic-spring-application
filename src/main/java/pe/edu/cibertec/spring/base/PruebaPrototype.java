/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.base;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Java-LM
 */
@Component
@Scope(value = "prototype")
public class PruebaPrototype {
    int x;

    public void setX(int x) {
        this.x = x;
    }
    
    public void imprimeX() {
        System.out.println("x: " + x);
    }
}
