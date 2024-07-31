package src;

public class SendEmailHandler extends Handler<SendEmailEvent> {

    public SendEmailHandler() {
        super(SendEmailEvent.class);
    }

    @Override
    public Void handle(SendEmailEvent event) {
        System.out.println("Email enviado para %s com a seguinte mensagem: %s".formatted(
            event.getName(), 
            event.getMessage()));
        return null;
    }
}
