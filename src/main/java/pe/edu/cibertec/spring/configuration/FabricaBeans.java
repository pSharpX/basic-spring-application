/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import pe.edu.cibertec.spring.base.Motor;
import pe.edu.cibertec.spring.base.MotorCarrera;

/**
 *
 * @author Java-LM
 */

@Configuration
public class FabricaBeans {
    
    @Bean
    @Lazy(true)
    public Motor motor(){
        System.out.println("Spring va a crear una instancia de MotorCarrera.");
        return new MotorCarrera("BRUM !!");
    }
    
    @Bean
    public Motor motorViejo(){
        System.out.println("Spring va a crear una instancia de MotorCarrera Viejo.");
        return new MotorCarrera("COF COF....... !!");
    }
    
}
