import enums.PhoneType;
import factories.ClockFactory;
import factories.PhoneFactory;
import interfaces.IDevice;

public class Program {
    
    public static void main(String ...args) {
        ClockFactory factory = new ClockFactory();
        IDevice device = factory.create("Samsung", "R$ 15000,00");
        device.connect();
        device.showModel();

        PhoneFactory.create(PhoneType.PHONEX).update();
        PhoneFactory.create(PhoneType.PHONE11).update();
    }
}
