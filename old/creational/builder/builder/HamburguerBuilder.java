package builder;

import model.Hamburguer;

public class HamburguerBuilder {
    
    private Hamburguer hamburguer;

    public HamburguerBuilder() {
        this.hamburguer = new Hamburguer();
    }

    public HamburguerBuilder egg(boolean b) {
        this.hamburguer.setEgg(b);
        return this;
    }

    public HamburguerBuilder bread(boolean b) {
        this.hamburguer.setBread(b);
        return this;
    }
    
    public HamburguerBuilder pepper(boolean b) {
        this.hamburguer.setPepper(b);
        return this;
    }

    public Hamburguer build() {
        return this.hamburguer;
    }
}
