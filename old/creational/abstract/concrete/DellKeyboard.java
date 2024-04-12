package concrete;

import abstraction.IKeyboard;

public class DellKeyboard implements IKeyboard {

    @Override
    public void write() {
        System.out.println("Typing...");
    }
    
}
