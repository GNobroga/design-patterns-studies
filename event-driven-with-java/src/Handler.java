package src;

public abstract class Handler<T extends Event> {

    private final Class<T> eventType;

    public Handler(Class<T> eventType) {
        this.eventType = eventType;
    }

    public abstract Object handle(T event);

    public Class<?> getEventType() {
        return eventType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Handler<Event> other = (Handler<Event>) obj;
        if (eventType == null) {
            if (other.eventType != null)
                return false;
        } else if (!eventType.equals(other.eventType))
            return false;
        return true;
    }

    
}
