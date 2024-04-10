package concrete;

import abstraction.IMouse;

public class RedDragonMouse implements IMouse {

    @Override
    public void click() {
       System.out.println("Clicking...");
    }
    
}
