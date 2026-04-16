package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificacionWsp implements Notificador {

    public void enviar(String telefono, String mensaje) {
        System.out.println("Se envia un wsp al numero: " + telefono);
        System.out.println("Con el mensaje: " + mensaje);

    }


}
