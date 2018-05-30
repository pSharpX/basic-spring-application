package pe.edu.cibertec.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class Vehiculo {

    //COMPORTAMIENTO POR DEFAULT: INYECCIÓN POR TIPO.
    @Autowired
    //INYECCIÓN POR NOMBRE: SE BRINDA EL NOMBRE DEL BEAN A INYECTAR.
    @Qualifier("parlanteUltraSound4K")
    private Parlante parlante;

    @Autowired
    private Asiento asiento;
    
    @Autowired
    @Qualifier("motorViejo")
    @Lazy(true)
    private Motor motor;
    
    private Parabrisas parabrisas;
    private AireAcondicionado aireAcondicionado;

    @Autowired
    public void setAireAcondicionado(AireAcondicionado aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    
    public Vehiculo(@Autowired @Qualifier("parabrisasImpl") Parabrisas parabrisas){
        this.parabrisas = parabrisas;
    }
    
    public void encenderAireAcondicionado(){
        aireAcondicionado.encender();
    }
    
    public void apagarAireAcondicionado(){
        aireAcondicionado.apagar();
    }
    
    public void limpiarParabrisas(){
        parabrisas.limpiar();
    }
    
    public void colocarCancion() {
        System.out.println(
                parlante.emitirSonido(
                        "Smell like teen spirit"));
    }
    
    public  void reclinarAsiento(){
        asiento.reclinear();
    }
    
    public void encenderVehiculo(){
        motor.encender();
    }
    
    public void avanzar(){
        System.out.println("Este vehiculo por defecto no avanza...");
    }
    
    public void detener(){
        System.out.println("Deteniendo vehiculo");
    }
    
    public int metrosRecorridos(){
        return 0;
    }
    
    public void acelerar(){
        System.out.println("Este vehiculo por defecto no acelera...");
    }
}
