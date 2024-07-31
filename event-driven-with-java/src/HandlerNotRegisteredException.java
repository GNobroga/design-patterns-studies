package src;

public class HandlerNotRegisteredException extends RuntimeException {
    
    public HandlerNotRegisteredException(Class<? extends Event> eventType) {
        super("No handler registered for event type: %s".formatted(eventType.getSimpleName()));
    }
}
