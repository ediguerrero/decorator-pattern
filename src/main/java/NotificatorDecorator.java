import java.util.List;

public abstract class NotificatorDecorator implements Notificator {

    protected final Notificator notificator;

    NotificatorDecorator ( Notificator notificator){

        this.notificator = notificator;
    }

    public void enviar(String message, List<String> accounts) {
        notificator.enviar(message, accounts);

    }
}
