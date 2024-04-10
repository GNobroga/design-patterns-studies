import abstraction.IComputerFactory;

public class Client {
    
    private IComputerFactory computerFactory;

    public Client(IComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
    }

    public void use() {
        computerFactory.getKeyboard().write();
        computerFactory.getMouse().click();
    }
}
