package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSms implements Notificador {

    public void enviar(String telefono, String mensaje) {
        System.out.println("Se envia el sms al numero: " + telefono);
        System.out.println("Con el mensaje: " + mensaje);

    }

}
