import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        //Notificator x= new SMS(new Facebook(new NotificatorConcrete()));
       // x.enviar("hola junior", Arrays.asList("PEPITO", "juana"));

        CreadorNotificator n = new CreadorNotificator("hola junior", Arrays.asList("PEPITO", "juana"));
        n.enviarPorSMS().enviarPorFacebook().enviar();
    }

}
