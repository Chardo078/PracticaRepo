package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificacionMail mail;
    @Inject
    private NotificadorSms sms;

    @Inject
    private NotificacionWsp wsp;

    public Notificador seleccionar(double total) {

        if (total > 100) {
            return mail;
        } else if (total < 50) {
            return wsp;
        } else {
            return sms;
        }

    }
}
