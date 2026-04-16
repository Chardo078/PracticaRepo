package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Default
public class NotificacionMail implements Notificador {

    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el mail al correo: " + destino);
        System.out.println("Con el mensaje: " + mensaje);

    }

}
