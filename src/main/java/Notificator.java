import java.util.List;

public interface Notificator {

    public void enviar(String message, List<String> accounts);
}
