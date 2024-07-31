package src;

import java.util.Set;

import java.util.HashSet;


public class EventDispatch {
    
    private final Set<Handler<Event>> handlers = new HashSet<>();

    @SuppressWarnings("unchecked")
    public void registerHandler(final Handler<?> handler) {
        this.handlers.add((Handler<Event>) handler);
    }

    @SuppressWarnings("unchecked")
    public <R> R send(final Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        for (final var handler: handlers) {
            if (handler.getEventType().equals(event.getClass())) {
                return (R) handler.handle(event);
            }
        }
        throw new HandlerNotRegisteredException(event.getClass());
    }

}
