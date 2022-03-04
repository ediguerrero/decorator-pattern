import java.util.List;

public class Email extends NotificatorDecorator{
    Email(Notificator notificator) {
        super(notificator);
        System.out.println("enviando por email");
    }

    public void enviar(String message, List<String> accounts) {
        notificator.enviar(message, accounts);
        System.out.println("el mensaje se envió por email " + message);
    }
}
