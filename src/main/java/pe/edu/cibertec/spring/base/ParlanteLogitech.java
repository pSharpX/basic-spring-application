package pe.edu.cibertec.spring.base;

import org.springframework.stereotype.Component;

@Component
public class ParlanteLogitech implements Parlante {

    @Override
    public String emitirSonido(String cancion) {
        return String.format("Volumen bajo. Canción %s.", cancion);
    }
    
}
