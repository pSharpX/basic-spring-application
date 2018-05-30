/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.base;

import org.springframework.stereotype.Service;

/**
 *
 * @author Java-LM
 */
@Service
public class Sillon implements Asiento{

    @Override
    public void reclinear() {
        System.out.println("Asiento cómodo y confortable");
    }
    
}
