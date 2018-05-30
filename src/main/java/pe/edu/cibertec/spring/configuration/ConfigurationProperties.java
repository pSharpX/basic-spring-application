/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Java-LM
 */

@Configuration
public class ConfigurationProperties {
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        
        Resource[] archivosPropiedades = new Resource[]{
            new ClassPathResource("settings.properties"),
            new ClassPathResource("dev_settings.properties"),
            new ClassPathResource("test_settings.properties")
        };
        pspc.setLocations(archivosPropiedades);
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }    
}
