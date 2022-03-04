import java.util.List;

public class Facebook extends NotificatorDecorator{


    Facebook(Notificator notificator) {
        super(notificator);
        System.out.println("enviando por Facebook");

    }

    public void enviar(String message, List<String> accounts) {
        notificator.enviar(message, accounts);
        System.out.println("el mensaje se envió por FACEBOOK " + message);
    }
}
