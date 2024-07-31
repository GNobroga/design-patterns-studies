package src;

public class SendEmailEvent extends Event {

    private final String recipient;

    private final String message;

    public SendEmailEvent(String recipient, String message) {
       super(SendEmailEvent.class.getSimpleName());
       this.recipient = recipient;
       this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
    
}
