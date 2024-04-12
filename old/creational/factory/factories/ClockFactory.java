package factories;
import interfaces.IDevice;
import model.Clock;

public class ClockFactory {

    public IDevice create(String name, String price) {
        return new Clock(name, price);
    }
    
}
