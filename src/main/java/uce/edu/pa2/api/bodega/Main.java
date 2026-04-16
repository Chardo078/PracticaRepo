package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    // Añadimos @ApplicationScoped para que la propia clase App 
    // esté dentro del mundo CDI y pueda usar CDI.current() sin problemas
    @ApplicationScoped
    public static class App implements QuarkusApplication {

        @Override
        public int run(String... args) {
            // --- SERVICE LOCATOR LOOKUP ---
            // Buscamos la instancia manualmente en el contenedor
            PedidoService1 pedidoService1 = CDI.current()
                    .select(PedidoService1.class)
                    .get();
 
            System.out.println("Ejecutando Caso 1 (vía Lookup)...");
            Pedido pedido = new Pedido("Deyvi Pilataxi", "Libro", 3, "ragonzaga@uce.edu.ec");
            pedidoService1.registrar(pedido);
            
            // ... resto de casos
            return 0;
        }
    }
}