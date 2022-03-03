import java.util.List;

public class CreadorNotificator {

    private  Notificator  notificator;
    private String message;
    private List<String> accounts;

    CreadorNotificator(String message, List<String> accounts){
        notificator = new NotificatorConcrete() ;
        this.message = message;
        this.accounts = accounts;
    }

    public void enviar(){
         notificator.enviar(message,accounts);
    }

    public CreadorNotificator enviarPorSMS(){
        notificator = new SMS(this.notificator);
        return this;
    }

    public CreadorNotificator enviarPorFacebook(){
        notificator = new Facebook(this.notificator);
        return this;
    }
}
