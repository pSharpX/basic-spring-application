/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.base;

/**
 *
 * @author Java-LM
 */
public interface AireAcondicionado {
    void encender();
    default void apagar(){
        System.out.println("Apagando aire acondicionado....");
    }
}
