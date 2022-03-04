import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        CreadorNotificator n = new CreadorNotificator("hola junior", Arrays.asList("PEPITO", "juana"));
        n.enviarPorSMS().enviarPorFacebook().enviar();
    }

}
