package src;

public abstract class Event {
    private final String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
