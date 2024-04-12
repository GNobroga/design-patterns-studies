import abstraction.IComputerFactory;
import concrete.PichauFactory;

public class Program {

    public static void main(String[] args) {

        IComputerFactory computerFactory = new PichauFactory();

        Client client = new Client(computerFactory);

        client.use();
    }
    
}
