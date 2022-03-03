import java.util.List;

public class SMS extends NotificatorDecorator{
    SMS(Notificator notificator) {
        super(notificator);
    }

    public void enviar(String message, List<String> accounts) {
        notificator.enviar(message, accounts);
        System.out.println("el mensaje se envió por SMS " + message);
    }
}
