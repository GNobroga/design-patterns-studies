package concrete;

import abstraction.IComputerFactory;
import abstraction.IKeyboard;
import abstraction.IMouse;

public class PichauFactory implements IComputerFactory {

    @Override
    public IKeyboard getKeyboard() {
       return new DellKeyboard();
    }

    @Override
    public IMouse getMouse() {
        return new RedDragonMouse();
    }
    
}
