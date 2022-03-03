import java.util.List;

public class NotificatorConcrete implements Notificator{
    public void enviar(String message, List<String> accounts) {
        System.out.println("enviando a");
        accounts.forEach(System.out::println);
    }
}
