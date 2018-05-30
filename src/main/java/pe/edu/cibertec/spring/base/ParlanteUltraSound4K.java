package pe.edu.cibertec.spring.base;

import org.springframework.stereotype.Component;

@Component
public class ParlanteUltraSound4K implements Parlante {

    @Override
    public String emitirSonido(String cancion) {
        return String.format("TREMENDA BULLAAAA!!! %s", cancion);
    }
}
