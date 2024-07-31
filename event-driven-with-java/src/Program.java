package src;

public class Program {
    
    public static void main(final String ...args) {
        final var dispatch = new EventDispatch();
        final var event = new SendEmailEvent("gabrielcardoso_stelo@hotmail.com", "Message for you!");
        final Handler<SendEmailEvent> handler = new SendEmailHandler();
        dispatch.registerHandler(handler);
        dispatch.registerHandler(handler);
        dispatch.registerHandler(handler);
        dispatch.send(event);
    }
}
