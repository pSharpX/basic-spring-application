package pe.edu.cibertec.spring.base;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.spring.carrera.PistaCarrera;
import pe.edu.cibertec.spring.vehiculo.VehiculoTerrestre;

@Component
class PrimerSpringBean {

    private String getCadenaLimpia(String s) {
        return Optional.ofNullable(s).orElse("");
    }

    public String saludar(String nombre) {
        return String.format("Hola %s", getCadenaLimpia(nombre));
    }
}

@ComponentScan("pe.edu.cibertec.spring")
//@Configuration
//@PropertySource(value = "classpath:settings.properties")
public class Principal {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(Principal.class);
        PrimerSpringBean psb = ctx.getBean(PrimerSpringBean.class);
        System.out.println(psb.saludar("Luiggi"));

        Vehiculo vehiculo = ctx.getBean("vehiculo",Vehiculo.class);
        vehiculo.colocarCancion();
        vehiculo.encenderVehiculo();
        vehiculo.limpiarParabrisas();
        vehiculo.encenderAireAcondicionado();
        vehiculo.apagarAireAcondicionado();

        VehiculoTerrestre carro = ctx.getBean(VehiculoTerrestre.class);
        VehiculoTerrestre moto = ctx.getBean(VehiculoTerrestre.class);
        
        carro.configurar("MAX 5", 55, 60);
        moto.configurar("HARLEY 5", 50, 60);
        
        PistaCarrera pistaCarrera = ctx.getBean(PistaCarrera.class);
        pistaCarrera.competencia(carro, moto);
        
//        PruebaPrototype prototype1 = ctx.getBean(PruebaPrototype.class);
//        PruebaPrototype prototype2 = ctx.getBean(PruebaPrototype.class);
//        PruebaPrototype prototype3 = ctx.getBean(PruebaPrototype.class);
//        
//        System.out.println("Los beans prototypes serán iguales ? " + (prototype1 == prototype2));
//        
//        prototype1.setX(2);
//        prototype2.setX(14);
//        prototype3.setX(9);
//        
//        prototype1.imprimeX();
//        prototype2.imprimeX();
//        prototype3.imprimeX();
//        
//        PruebaSingletonConEstado singleton1 = ctx.getBean(PruebaSingletonConEstado.class);
//        PruebaSingletonConEstado singleton2 = ctx.getBean(PruebaSingletonConEstado.class);
//        
//        singleton1.setX(5);
//        singleton2.setX(7);
//        
//        singleton1.imprimeX();
//        singleton2.imprimeX();
//        singleton1.imprimeX();
//        singleton2.imprimeX();
//        singleton1.imprimeX();
//        singleton2.imprimeX();
//        
//        System.out.println("-------------------------------------------");
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for (int i = 1; i <= 100; i++) {
//            final int x = i;
//            es.submit(() -> {
//                PruebaSingletonConEstado singleton4 = 
//                        ctx.getBean(PruebaSingletonConEstado.class);
//                singleton4.setX(x);
//                singleton4.imprimeX();
//            });
//        }
//        es.shutdown();
               
//        Vehiculo vehiculo2 = ctx.getBean(Vehiculo.class);
//        System.out.println(vehiculo == vehiculo2);

        //EL SCOPE SINGLETON ES POR CONTEXTO
//        ApplicationContext ctx2
//                = new AnnotationConfigApplicationContext(Principal.class);
//        Vehiculo vehiculo3 = ctx2.getBean(Vehiculo.class);
//        System.out.println(vehiculo == vehiculo3);
    }
}
